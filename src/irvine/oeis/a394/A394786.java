package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394786 a(n) = number of triples (x, y, z) such that x^2 + y*z = n, where x,y,z are positive integers satisfying x^2 &lt; y*z.
 * @author Sean A. Irvine
 */
public class A394786 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long y = 1; y <= mN; ++y) {
      for (long x = 1; x * x < y * mN; ++x) {
        mCounts.add(x * x + y * mN, y == mN ? 1 : 2);
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
