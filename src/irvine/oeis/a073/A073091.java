package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073091 Number of ways to express n as (x^3+y^3+z^3)/(x+y+z) 1&lt;=x&lt;=y&lt;=z&lt;=n.
 * @author Sean A. Irvine
 */
public class A073091 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    // z = mN
    final long z3 = mN * mN * mN;
    for (long y = 1; y <= mN; ++y) {
      final long z3y3 = z3 + y * y * y;
      for (long x = 1; x <= y; ++x) {
        final long z3y3x3 = z3y3 + x * x * x;
        final long s = x + y + mN;
        if (z3y3x3 % s == 0) {
          mCounts.increment(z3y3x3 / s);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
