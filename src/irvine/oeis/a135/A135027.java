package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A135027 Numbers k such that the sum of the digits of k^2 is 10. Multiples of 10 are omitted.
 * @author Sean A. Irvine
 */
public class A135027 extends Sequence1 {

  private long mN = 7;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      if (mVerbose && (mN & 0xFFFFFFFL) == 0) {
        System.err.println("[" + mN + "]");
      }
      if (++mN % 10 != 0) {
        if (mN > Integer.MAX_VALUE) {
          Z v = Z.valueOf(mN).square();
          long s = 0;
          while (!v.isZero()) {
            s += v.mod(10);
            if (s > 10) {
              break;
            }
            v = v.divide(10);
          }
          if (s == 10) {
            return Z.valueOf(mN);
          }
        } else {
          long v = mN * mN;
          long s = 0;
          while (v > 0) {
            s += v % 10;
            if (s > 10) {
              break;
            }
            v /= 10;
          }
          if (s == 10) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

