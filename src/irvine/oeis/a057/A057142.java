package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057142 Occurrences of most frequently occurring number in 1-to-n multiplication table.
 * @author Sean A. Irvine
 */
public class A057142 implements Sequence {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mMax = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      final long r = k * mN;
      final long c = mCounts.get(r) + (k == mN ? 1 : 2);
      mCounts.set(r, c);
      if (c > mMax) {
        mMax = c;
      }
    }
    return Z.valueOf(mMax);
  }
}
