package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;
import irvine.util.string.StringUtils;

/**
 * A014597 Numbers k such that k^2 is a sum of distinct factorials.
 * @author Sean A. Irvine
 */
public class A014597 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicArray<Z> mSums = new LongDynamicArray<>();
  {
    mSums.set(0, Z.ZERO);
  }
  private long mPos = 0;
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final long len = mSums.length();
      if (++mPos >= len) {
        mF = mF.multiply(++mN);
        if (mVerbose) {
          StringUtils.message("Starting additions for " + mN + "!");
        }
        for (long k = 0, j = len; k < len; ++k, ++j) {
          mSums.set(j, mSums.get(k).add(mF));
        }
        if (mVerbose) {
          StringUtils.message("Finished additions for " + mN + "!");
        }
      }
      final Z v = mSums.get(mPos);
      final Z s = v.sqrt();
      if (v.auxiliary() == 1) {
        return s;
      }
    }
  }
}
