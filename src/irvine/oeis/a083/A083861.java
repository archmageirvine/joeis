package irvine.oeis.a083;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083861 Square array T(n,k) of second binomial transforms of generalized Fibonacci numbers, read by ascending antidiagonals, with n, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A083861 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  protected MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return Z.ZERO;
      }
      if (m == 1) {
        return Z.ONE;
      }
      return get(n, m - 1).multiply(5).add(get(n, m - 2).multiply(n - 6));
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
