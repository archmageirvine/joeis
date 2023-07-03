package irvine.oeis.a242;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A242249 Number A(n,k) of rooted trees with n nodes and k-colored non-root nodes; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A242249 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n < 2) {
      return Z.valueOf(n);
    }
    Z sum = Z.ZERO;
    for (int j = 1; j < n; ++j) {
      sum = sum.add(Integers.SINGLETON.sumdiv(j, d -> get(d, k).multiply(d)).multiply(get(n - j, k).multiply(k)));
    }
    return sum.divide(n - 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
