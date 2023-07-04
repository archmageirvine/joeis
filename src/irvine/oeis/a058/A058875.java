package irvine.oeis.a058;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A058875 Triangle T(n,k) = C_n(k)/2^(k*(k-1)/2) where C_n(k) = number of k-colored labeled graphs with n nodes (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A058875 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m == 1) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(1, n - 1, k -> Binomial.binomial(n, k).multiply(get(k, m - 1)).shiftLeft(k * (n - k))).divide(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM).shiftRight(mM * (mM - 1) / 2);
  }
}
