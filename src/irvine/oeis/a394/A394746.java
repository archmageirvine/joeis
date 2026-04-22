package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394746 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394746 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long y = 1; y <= mN; ++y) {
      for (long x = 1; x <= y; ++x) {
        mCounts.increment(x * x + y * mN);
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
