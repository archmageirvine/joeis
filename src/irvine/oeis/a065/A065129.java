package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A065129 a(n) is the least m such that m/A003285(m) = n, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A065129 extends A003285 {

  // After bounds from Nathaniel Johnston

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      for (long m = mN; m <= Math.pow(3.76 * mN * Math.log(m), 2); m += mN) {
        final Z zm = Z.valueOf(m);
        final long period = period(zm).longValueExact();
        if (m == period * mN) {
          return zm;
        }
      }
    }
    return Z.ZERO;
  }
}

