package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062746 Coefficient array for certain polynomials N(3; k,x) (rising powers of x).
 * @author Sean A. Irvine
 */
public class A062746 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > 2 * n) {
        return Z.ZERO;
      }
      final Z t = Binomial.binomial(2L * n + 1, m + 1).multiply(Binomial.binomial(3L * n + 1, n)).divide(3L * n + 1);
      if (m <= 2 * n - 3) {
        return get(n - 1, m + 1).signedAdd((m & 1) == 0, t);
      }
      return (m & 1) == 0 ? t : t.negate();
    }
  };

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}

