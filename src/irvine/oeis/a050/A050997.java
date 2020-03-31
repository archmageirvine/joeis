package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A050997.
 * @author Sean A. Irvine
 */
public class A050997 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(5);
  }

//  public static void main(final String[] args) {
//    // Explore conjecture by Dimitris Valianatos
//    final CR b = CR.valueOf(new Q(2816, 2625));
//    final Sequence seq = new A050997();
//    long mN = 0;
//    Q prod = Q.ONE;
//    while (true) {
//      ++mN;
//      final Z p5 = seq.next();
//      if (p5.mod(4) == 1) {
//        prod = prod.multiply(new Q(p5.subtract(1), p5.add(1)));
//      } else {
//        prod = prod.multiply(new Q(p5.add(1), p5.subtract(1)));
//      }
//      final CR c = CR.valueOf(prod);
//      System.out.println(mN + " " + c.toString(50) + " " + c.subtract(b).toString(50));
//    }
//  }
}

