package irvine.oeis.a080;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080046 Multiplicative Pascal triangle, read by rows: T(n,1)=T(n,n)=n and T(n,k) = T(n-1,k-1) * T(n-1,k).
 * @author Sean A. Irvine
 */
public class A080046 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mT = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return m == 1 || m == n ? Z.valueOf(n) : get(n - 1, m - 1).multiply(get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mT.get(mN, mM);
  }
}
