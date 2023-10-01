package irvine.oeis.a066;

import irvine.factor.prime.Puma;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066119 Multi-level primorials: triangle with a(n,k)=a(n-1,k-1)*a(n-1,k) but with a(n,1)=p(n) and a(n,n)=2.
 * @author Sean A. Irvine
 */
public class A066119 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Puma.primeZ(n);
      }
      if (m == n) {
        return Z.TWO;
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
