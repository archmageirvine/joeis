package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064735 Next prime containing prime(n) in decimal notation.
 * @author Sean A. Irvine
 */
public class A064735 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final String s = p.toString();
    Z q = Z.TEN.pow(s.length());
    while (true) {
      q = mPrime.nextPrime(q);
      if (q.toString().contains(s)) {
        return q;
      }
    }
  }
}

