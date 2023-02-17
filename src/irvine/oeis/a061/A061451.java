package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061451 Array T(n,k) of k-th order Fibonacci numbers read by antidiagonals in up-direction.
 * @author Sean A. Irvine
 */
public class A061451 extends Sequence1 {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(m - n - 2, m - 1, k -> mB.get(n, k));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM);
  }
}

