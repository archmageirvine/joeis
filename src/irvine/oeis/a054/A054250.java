package irvine.oeis.a054;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A054250 Triangular array T(n,0)= 1, T(n,k) = sum_{j=1..min(n,k)} (n-j+1)*T(j,k-j) if k&gt;0.
 * @author Sean A. Irvine
 */
public class A054250 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= Math.min(n, m); ++k) {
      sum = sum.add(get(k, m - k).multiply(n - k + 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
