package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A000437 Smallest nonnegative number that is the sum of 3 squares in exactly n ways.
 * @author Sean A. Irvine
 */
public class A000437 implements Sequence {

  private long mLast = -1;
  private long mLastSq = -1;
  private int mN = 0;
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();

  protected boolean accept(final int count, final int n) {
    return count == n;
  }

  @Override
  public Z next() {
    ++mN;
    long pos = -1;
    while (true) {
      ++pos;
      if (pos > mLastSq) {
        ++mLast;
        mLastSq = mLast * mLast;
        for (long a = 0; a <= mLast; ++a) {
          final long aa = mLastSq + a * a;
          for (long b = a; b <= mLast; ++b) {
            final long z = aa + b * b;
            mCounts.set(z, mCounts.get(z) + 1);
          }
        }
      }
      if (accept(mCounts.get(pos), mN)) {
        return Z.valueOf(pos);
      }
    }
  }
}
