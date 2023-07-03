package irvine.oeis.a042;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A042977 Triangle T(n,k) read by rows: coefficients of a polynomial sequence occurring when calculating the n-th derivative of Lambert function W.
 * @author Sean A. Irvine
 */
public class A042977 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 1) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n - 1, m + 1).multiply(m + 1).subtract(get(n - 1, m - 1).multiply(n - 1)).subtract(get(n - 1, m).multiply(3 * (n - 1) - m - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
