package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A081767.
 * @author Sean A. Irvine
 */
public class A390246 extends Sequence1 {

  private int mN = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private boolean[] mUsed = null;
  private int mK = 0;

  private boolean is(final int v) {
    if (v == 1) {
      return true;
    }
    for (int lo = ((mN + v) / v) * v; lo < mN + mK; lo += v) {
      if (!mUsed[lo]) {
        mUsed[lo] = true;
        if (is(v - 1)) {
          return true;
        }
        mUsed[lo] = false;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    mK = mN;
    while (true) {
      ++mK;
      mUsed = new boolean[mN + mK];
      if (is(mN)) {
        return Z.valueOf(mK);
      }
      if (mVerbose) {
        StringUtils.message("n=" + mN + " completed check for k=" + mK);
      }
    }
  }
}

