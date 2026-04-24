package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395277 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395277 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long y = 1; y < mN; ++y) {
      final long u = y * mN;
      for (long x = 2; x < mN; ++x) {
        if (x != y) {
          for (long w = 1; w < x && w * x <= u; ++w) {
            if (w != y) {
              mCounts.increment(w * x + u);
            }
          }
        }
      }
    }
    for (long z = 2; z < mN; ++z) {
      for (long y = 1; y < z; ++y) {
        final long u = y * z;
        for (long w = 1; w < mN && w * mN <= u; ++w) {
          if (w != z && w != y) {
            mCounts.increment(w * mN + u);
          }
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
