package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt2;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080044 Numerators of triangular array: T(n,1)=T(n,n)=1/n and T(n,k)=T(n-1,k-1)+T(n-1,k), 1&lt;k&lt;n.
 * @author Sean A. Irvine
 */
public class A080044 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Q> mT = new MemoryFunctionInt2<>() {
    @Override
    protected Q compute(final int n, final int m) {
      return m == 1 || m == n ? new Q(1, n) : get(n - 1, m - 1).add(get(n - 1, m));
    }
  };

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return select(mT.get(mN, mM));
  }
}
