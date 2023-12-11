package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A050446 Table T(n,m) giving total degree of n-th-order elementary symmetric polynomials in m variables, -1 &lt;= n, 1 &lt;= m, read by upward antidiagonals.
 * @author Sean A. Irvine
 */
public class A050446 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || n == 0) {
      return Z.ONE;
    }
    Z sum = get(n, m - 1);
    for (long k = 0; k <= (n - 1) / 2; ++k) {
      sum = sum.add(get(2 * k, m - 1).multiply(get(n - 1 - 2 * k, m)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN - mM, mM);
  }
}
