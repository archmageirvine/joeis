package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A062857 Size of smallest square multiplication table which contains some number at least n times.
 * @author Sean A. Irvine
 */
public class A062857 extends Sequence1 {

  private int mN = 0;
  private long mK = 0;
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private int mMaxCount = 0;
  protected long mMaxCountMinValue = 1;

  @Override
  public Z next() {
    ++mN;
    while (mMaxCount < mN) {
      ++mK;
      for (long j = 1; j < mK; ++j) {
        final int cnt = mCounts.get(j * mK) + 2;
        mCounts.set(j * mK, cnt);
        if (cnt > mMaxCount) {
          mMaxCount = cnt;
          mMaxCountMinValue = j * mK;
        }
      }
      mCounts.set(mK * mK, 1);
      if (mMaxCount == 0) {
        mMaxCount = 1;
      }
    }
    return Z.valueOf(mK);
  }
}
