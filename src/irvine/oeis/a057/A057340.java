package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057340 Smallest of the most frequently occurring numbers in 1-to-n multiplication cube.
 * @author Sean A. Irvine
 */
public class A057340 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mMax = 0;
  private long mArgMax = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= k; ++j) {
        final long r = j * k * mN;
        final int m;
        if (k == mN) {
          m = j == mN ? 1 : 3;
        } else if (k == j) {
          m = 3;
        } else {
          m = 6;
        }
        final long c = mCounts.get(r) + m;
        mCounts.set(r, c);
        if (c >= mMax) {
          if (c > mMax || r < mArgMax) {
            mArgMax = r;
          }
          mMax = c;
        }
      }
    }
    return Z.valueOf(mArgMax);
  }
}
