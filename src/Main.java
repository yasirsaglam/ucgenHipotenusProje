import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Hipotenüs Bulma
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenar Uzunluğunu Giriniz : ");
        a = input.nextInt();
        System.out.println("2. Kenar Uzunluğunu Giriniz : ");
        b = input.nextInt();
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs : " + c);
        */

        //Alan Hesaplama
        int aKenar, bKenar, cKenar;
        double u, cevre, alan;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenar Uzunluğunu Giriniz : ");
        aKenar = input.nextInt();
        System.out.println("2. Kenar Uzunluğunu Giriniz : ");
        bKenar = input.nextInt();
        System.out.println("2. Kenar Uzunluğunu Giriniz : ");
        cKenar = input.nextInt();
        cevre = aKenar + bKenar + cKenar;
        u = cevre / 2;
        alan = (int)Math.sqrt(u * (u - aKenar) * (u - bKenar) * (u - cKenar));
        System.out.println("Üçgen Çevresi : " + cevre);
        System.out.println("Üçgen Alanı : " + alan);
    }
}
