package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A393712 a(n) = number of triples (x, y, z) such that x^2 + y*z = n, where x, y, z are positive integers satisfying x &lt; y &lt;= z.
 * @author Sean A. Irvine
 */
public class A393712 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mZ = 1;

  @Override
  public Z next() {
    if (++mN >= mZ + 1) {
      ++mZ;
      for (long y = 2; y <= mZ; ++y) {
        for (long x = 1; x < y; ++x) {
          mCounts.increment(x * x + y * mZ);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
