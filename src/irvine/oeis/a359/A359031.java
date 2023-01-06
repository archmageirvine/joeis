package irvine.oeis.a359;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A359031 allocated for Bence Bern\u00e1th.
 * @author Sean A. Irvine
 */
public class A359031 extends Sequence2 {

  private final long[] mCounts = new long[10];
  private long mPrev = 0;

  private int mode(final long v) {
    final int[] cnts = ZUtils.digitCounts(v);
    int mode = 0;
    int res = 0;
    for (int k = 0; k < cnts.length; ++k) {
      if (cnts[k] > mode) {
        mode = cnts[k];
        res = k;
      }
    }
    return res;
  }

  @Override
  public Z next() {
    final int mode = mode(mPrev);
    final long v = mCounts[mode];
    final int[] c = ZUtils.digitCounts(v);
    for (int k = 0; k < mCounts.length; ++k) {
      mCounts[k] += c[k];
    }
    mPrev = v;
    return Z.valueOf(v);
  }
}
