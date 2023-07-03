package irvine.oeis.a052;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A052154 Array read by antidiagonals: a(n,k)= coefficient of z^n of p_k(z), where p_k+1(z)=(p_k(z))^2+z, p_1(z)=z.
 * @author Sean A. Irvine
 */
public class A052154 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 1) {
      return Z.ONE;
    }
    if (n > 1L << (m - 1)) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k < n; ++k) {
      sum = sum.add(get(k, m - 1).multiply(get(n - k, m - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mM, mN - mM + 1);
  }
}
