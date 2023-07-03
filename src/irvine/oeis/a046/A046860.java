package irvine.oeis.a046;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A046860 Triangle giving a(n,k) = number of k-colored labeled graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A046860 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0 && m == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long r = 0; r < n; ++r) {
      sum = sum.add(Binomial.binomial(n, r).multiply(get(r, m - 1)).shiftLeft(r * (n - r)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
