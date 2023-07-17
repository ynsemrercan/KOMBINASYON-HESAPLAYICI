import java.util.Scanner;
public class kominasyonHesaplayici {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num2,num1;
        int total1=1,total2=1,total3=1;

        System.out.print("Bir sayı girin: ");
        num1 = scanner.nextInt();

        System.out.println("Sayının Kaçlı Kombinasyonu Alıncak:  ");
        num2=scanner.nextInt();

        for (int i=1;i<=num1;i++){

            total1=total1*i;

        }

        for (int j=1;j<=num2;j++){

            total2=total2*j;
        }

        for (int k=1;k<=(num1-num2);k++){

            total3=total3*k;
        }

        double C=total1/(total2*total3);

        System.out.println("Cevap: "+ C);




    }
}