package irvine.oeis.a077;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077593 Table by antidiagonals where T(n,k) = Sum_{i=1..n} T(floor(n/i),k-1) starting with T(n,0)=1 if n&gt;0 and T(0,0)=0.
 * @author Sean A. Irvine
 */
public class A077593 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return n == 0 ? Z.ZERO : Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n, k -> get(n / k, m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}
