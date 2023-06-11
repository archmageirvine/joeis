package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A064048 Number of most frequently occurring numbers in the 1-to-n multiplication table.
 * @author Sean A. Irvine
 */
public class A064048 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;
  private long mMax = 0;
  private long mMaxCount = 0;

  private void update(final long t, final long add) {
    final long cnt = mCounts.get(t) + add;
    mCounts.set(t, cnt);
    if (cnt >= mMax) {
      if (cnt > mMax) {
        mMax = cnt;
        mMaxCount = 1;
      } else {
        ++mMaxCount;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k < mN; ++k) {
      update(k * mN, 2);
    }
    update(mN * mN, 1);
    return Z.valueOf(mMaxCount);
  }
}
