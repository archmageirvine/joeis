package irvine.oeis.a086;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A152795 Triangle defined by T(n,k) = T(n-1,k-1) + Sum_{j=k..n-2} T(n-1,j)*2^j*T(j,k-1) for n &gt; k &gt; 0 with T(n,n) = T(n,0) = 1, read by rows n &gt;= 0 as k = 0..n.
 * @author Sean A. Irvine
 */
public class A152795 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == m || m == 0) {
        return Z.ONE;
      }
      return get(n - 1, m - 1).add(Integers.SINGLETON.sum(m, n - 2, j -> get(n - 1, j).multiply(get(j, m - 1)).shiftLeft(j)));
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
