package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394745 a(n) = number of triples (x, y, z) such that x^2 + y*z = n, where x,y,z are positive integers satisfying x &gt; max(y,z).
 * @author Sean A. Irvine
 */
public class A394745 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long y = 1; y < mN; ++y) {
      for (long z = 1; z < mN; ++z) {
        mCounts.increment(mN * mN + y * z);
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
