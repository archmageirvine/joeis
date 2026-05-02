package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395277 a(n) = number of 4-tuples (w, x, y, z) of distinct positive integers w, x, y, z such that w*x + y*z = n, where w*x &lt;= y*z, w &lt; x, and y &lt; z.
 * @author Sean A. Irvine
 */
public class A395501 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    // z == mN
    for (long y = 1; y < mN; ++y) {
      final long u = y * mN;
      for (long x = 2; x < mN; ++x) {
        if (x != y) {
          for (long w = 1; w < x && w < y; ++w) {
            mCounts.increment(w * x + u);
          }
        }
      }
    }
    // x == mN
    for (long z = 2; z < mN; ++z) {
      for (long y = 1; y < z; ++y) {
        final long u = y * z;
        for (long w = 1; w < mN && w < y; ++w) {
          mCounts.increment(w * mN + u);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN)).multiply(8);
  }
}
