package irvine.oeis.a117;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A117975.
 * @author Sean A. Irvine
 */
public class A117975 implements Sequence {

  private int[] mPrev = null;
  private int mPos = 1;

  private boolean exists(final int n) {
    for (final int v : mPrev) {
      if (v == n) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = new int[] {1};
      return Z.ONE;
    }
    if (mPos >= mPrev.length) {
      final int[] t = new int[mPrev.length + 1];
      for (int m = 1; m <= t.length; ++m) {
        int c = 0;
        for (int n = 1; n <= t.length; ++n) {
          if (!exists(n) && IntegerUtils.gcd(m, n) == 1) {
            ++c;
          }
        }
        t[m - 1] = c;
      }
      mPos = 0;
      mPrev = t;
    }
    return Z.valueOf(mPrev[mPos++]);
  }
}
