package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057143 Largest of the most frequently occurring numbers in 1-to-n multiplication table.
 * @author Sean A. Irvine
 */
public class A057143 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mMax = 0;
  private long mArgMax = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      final long r = k * mN;
      final long c = mCounts.get(r) + (k == mN ? 1 : 2);
      mCounts.set(r, c);
      if (c >= mMax) {
        if (c > mMax || r > mArgMax) {
          mArgMax = r;
        }
        mMax = c;
      }
    }
    return Z.valueOf(mArgMax);
  }
}
