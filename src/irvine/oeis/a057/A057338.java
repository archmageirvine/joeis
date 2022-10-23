package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057338 Occurrences of most frequently occurring number in 1-to-n multiplication cube.
 * @author Sean A. Irvine
 */
public class A057338 extends Sequence1 {

  private static final int[] MULTS = {0, 1, 3, 6};
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mMax = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      final int sk = k == mN ? 2 : 3;
      for (long j = 1; j <= k; ++j) {
        final long r = j * k * mN;
        final long c = mCounts.get(r) + MULTS[sk - (j == k ? 1 : 0)];
        mCounts.set(r, c);
        if (c > mMax) {
          mMax = c;
        }
      }
    }
    return Z.valueOf(mMax);
  }
}
