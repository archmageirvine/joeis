package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A000443.
 * @author Sean A. Irvine
 */
public class A000443 implements Sequence {

  private long mLast = -1;
  private long mLastSq = -1;
  private long mN = -1;
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN > mLastSq) {
        ++mLast;
        mLastSq = mLast * mLast;
        for (long a = 0; a <= mLast; ++a) {
          final long z = mLastSq + a * a;
          mCounts.set(z, mCounts.get(z) + 1);
        }
      }
      if (mCounts.get(mN) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
