package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062986 Coefficient array for certain polynomials N(5; k,x) (rising powers in x).
 * @author Sean A. Irvine
 */
public class A062986 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > 4 * n) {
        return Z.ZERO;
      }
      final Z t = Binomial.binomial(4L * n + 1, m + 1).multiply(Binomial.binomial(5L * n + 1, n)).divide(5L * n + 1);
      if (m <= 4 * n - 5) {
        return get(n - 1, m + 1).signedAdd((m & 1) == 0, t);
      }
      return (m & 1) == 0 ? t : t.negate();
    }
  };

  @Override
  public Z next() {
    if (++mM > 4 * mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}

