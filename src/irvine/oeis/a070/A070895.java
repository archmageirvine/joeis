package irvine.oeis.a070;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070895 Triangle read by rows where T(n+1,k)=T(n,k)+n*T(n-1,k) starting with T(n,n)=1 and T(n,k)=0 if n&lt;k.
 * @author Sean A. Irvine
 */
public class A070895 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n <= m) {
        return n == m ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, m).add(get(n - 2, m).multiply(n - 1));
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
