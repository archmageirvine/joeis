package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064484 Triangle T(n,k), n &gt;= 2, n+1 &lt;= k &lt;= 2*n-1, number of permutations p of 1,...,n, with max(p(i)+p(i-1), i=2..n) = k.
 * @author Sean A. Irvine
 */
public class A064484 extends Sequence2 {

  private int mN = 1;
  private int mM = 1;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1 && m == 2) {
        return Z.ONE;
      }
      if (m <= n || m >= 2 * n) {
        return Z.ZERO;
      }
      if ((m & 1) == 0) {
        return get(n - 1, m - 1).multiply(m - n);
      } else {
        return Integers.SINGLETON.sum(n, m - 2, k -> get(n - 1, k)).multiply2().add(get(n - 1, m - 1).multiply(m - n + 1));
      }
    }
  };

  @Override
  public Z next() {
    if (++mM >= 2 * mN) {
      ++mN;
      mM = mN + 1;
    }
    return mB.get(mN, mM);
  }
}
