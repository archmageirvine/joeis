package irvine.oeis.a391;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391950 Triangle T(n,k) of coefficients of polynomials arising from Gaussian-weighted Chebyshev integrals.
 * @author Sean A. Irvine
 */
public class A391950 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 1 || m >= n) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n - 1, j -> get(j, m - (n - j - 1)))
        .multiply(2L * n - 1).multiply2()
        .subtract(get(n - 1, m - 1))
        .add(n - 1 == m ? 2 : 0);
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
