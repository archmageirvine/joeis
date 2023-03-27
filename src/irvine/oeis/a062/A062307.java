package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a008.A008477;

/**
 * A062307 Numbers n such that n = A008477(A008477(n)) and n is not A008478.
 * @author Sean A. Irvine
 */
public class A062307 extends A008477 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final long t = f(++mN).longValueExact();
      if (t != mN && f(t).longValueExact() == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

