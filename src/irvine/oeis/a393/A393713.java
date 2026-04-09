package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A393713 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393713 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mZ = 2;

  @Override
  public Z next() {
    if (++mN >= mZ + 1) {
      ++mZ;
      for (long x = 2; x < mZ; ++x) {
        for (long y = 1; y < x; ++y) {
          mCounts.increment(x * x + y * mZ);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
