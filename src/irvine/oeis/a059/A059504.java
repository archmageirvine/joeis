package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059504 Numbers k with the property that reading k gives correct, although not necessarily complete, information about itself.
 * @author Sean A. Irvine
 */
public class A059504 extends Sequence1 {

  private long mN = 9;
  private long mLim = 100;

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    long m = n;
    while (m != 0) {
      final int d = (int) (m % 10);
      final int c = (int) (m / 10 % 10);
      if (cnts[d] != c) {
        return false;
      }
      m /= 100;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        // Only even length numbers are permitted
        mN = mLim * 10;
        mLim *= 100;
      }
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
