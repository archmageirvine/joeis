package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064319 Triangle with a(n,1)=n and a(n,k)=a(n-1,k)*a(n-1,k-1).
 * @author Sean A. Irvine
 */
public class A064319 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.valueOf(mN);
      }
      return get(n, m - 1).multiply(get(n - 1, m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
