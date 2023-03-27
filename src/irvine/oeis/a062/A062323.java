package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062323 Triangle with a(n,n)=1, a(n,k)=(n-1)*a(n-1,k)+a(n-2,k) for n&gt;k.
 * @author Sean A. Irvine
 */
public class A062323 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == m) {
        return Z.ONE;
      }
      if (m >= n) {
        return Z.ZERO;
      }
      return get(n - 1, m).multiply(n - 1).add(get(n - 2, m));
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
