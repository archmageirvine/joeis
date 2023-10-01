package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066121 Multi-level factorials: triangle with a(n,k)=a(n-1,k-1)*a(n-1,k) but with a(n,1)=n and a(n,n)=1.
 * @author Sean A. Irvine
 */
public class A066121 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.valueOf(n);
      }
      if (m == n) {
        return Z.ONE;
      }
      return get(n - 1, m).multiply(get(n - 1, m - 1));
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
