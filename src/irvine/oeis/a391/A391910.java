package irvine.oeis.a391;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391910 Triangle read by rows: T(n,k) are the unique integer coefficients such that Sum_{k=0..n} T(n,k)*A125790(k,m)/2^(n*k) = (m+2)^n for all n &gt;= 0, m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A391910 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(0, n - 1, j -> Binomial.binomial(n, j).multiply(get(j, m - 1)).shiftLeft((long) m * (n - j)));
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
