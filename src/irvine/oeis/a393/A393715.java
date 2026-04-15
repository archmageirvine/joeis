package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A393715 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393715 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    // z == mN
    for (long y = 1; y <= mN; ++y) {
      for (long x = 1; x <= mN; ++x) {
        if (Functions.GCD.l(x, y * mN) > 1) {
          mCounts.increment(x * x + y * mN);
        }
      }
    }
    // y == mN
    for (long z = 1; z < mN; ++z) {
      for (long x = 1; x <= mN; ++x) {
        if (Functions.GCD.l(x, mN * z) > 1) {
          mCounts.increment(x * x + mN * z);
        }
      }
    }
    // x == mN
    for (long y = 1; y < mN; ++y) {
      for (long z = 1; z < mN; ++z) {
        if (Functions.GCD.l(mN, y * z) > 1) {
          mCounts.increment(mN * mN + y * z);
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
