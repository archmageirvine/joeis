package irvine.oeis.a391;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391467 Triangle read by rows: T(n,0) = T(n,n) = 0 and T(n,k) = T(n, k-1) + T(n-1, k-1) + T(n-2, k-1) + k for 0 &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A391467 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return m == 0 || n == m ? Z.ZERO : get(n, m - 1).add(get(n - 1, m - 1)).add(get(n - 2, m - 1)).add(m);
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
