package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060959 Table by antidiagonals of generalized Fibonacci numbers: T(n,k) = T(n,k-1) + n*T(n,k-2) with T(n,0)=0 and T(n,1)=1.
 * @author Sean A. Irvine
 */
public class A060959 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt2<Z> mT = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m <= 1) {
        return m == 0 ? Z.ZERO : Z.ONE;
      }
      return get(n, m - 1).add(get(n, m - 2).multiply(n));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mT.get(mM, mN - mM);
  }
}
