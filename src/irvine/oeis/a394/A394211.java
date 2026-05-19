package irvine.oeis.a394;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394211 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A394211 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int r) {
      if (n == 0 || m == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 1; k <= r; ++k) {
        if (Functions.BIG_OMEGA.i(k) == m) {
          sum = sum.add(get(n - k, m, Math.min(k, n - k)));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    if (++mM > IntegerUtils.floorLog2(mN)) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM, mN);
  }
}
