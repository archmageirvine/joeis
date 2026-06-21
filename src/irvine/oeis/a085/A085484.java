package irvine.oeis.a085;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085484 Symmetric square array, read by antidiagonals: T(k, k) = T(0, k + 1) = Sum_{m = 0..k} C(k, m)*T(m, k - m) for k &gt;= 0; T(0, 0) = 1; T(n, k) = T(n - 1, k) + T(n, k - 1) for n, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A085484 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n > 2 * k) {
        return get(n, n - k);
      }
      if (k == n) {
        return Integers.SINGLETON.sum(0, n - 1, i -> get(n - 1, i).multiply(Binomial.binomial(n - 1, i)));
      }
      return get(n - 1, k).add(get(n - 1, k - 1));
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
