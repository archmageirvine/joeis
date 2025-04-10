package irvine.oeis.a076;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076626 Array of coefficients of polynomials p(n,x) = 2^(n-1)*Product_{i=0..n} (x - cos(i*Pi/n)) of degree (n+1) with P(-1,x) = 1, P(0,x) = 0.
 * @author Sean A. Irvine
 */
public class A076626 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      if (n == 1) {
        return Z.ZERO;
      }
      if (n == 2 && m == 2) {
        return Z.ONE;
      }
      return mB.get(n - 1, m - 1).multiply2().subtract(mB.get(n - 2, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
