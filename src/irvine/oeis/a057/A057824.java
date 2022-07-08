package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A057824 Primes p such that p+1 is LCM(1,...,m) for some (usually more than one) m.
 * @author Sean A. Irvine
 */
public class A057824 extends A003418 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.equals(mPrev)) {
        mPrev = t;
        final Z lo = t.subtract(1);
        if (lo.isProbablePrime()) {
          return lo;
        }
      }
    }
  }
}
