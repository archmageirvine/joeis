package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A057822 Smaller of pair of twin primes whose average is lcm(1,...,m) for some m.
 * @author Sean A. Irvine
 */
public class A057822 extends A003418 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.equals(mPrev)) {
        mPrev = t;
        final Z lo = t.subtract(1);
        if (lo.isProbablePrime() && t.add(1).isProbablePrime()) {
          return lo;
        }
      }
    }
  }
}
