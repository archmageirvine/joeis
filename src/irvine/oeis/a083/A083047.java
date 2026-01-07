package irvine.oeis.a083;

import irvine.math.MemoryFunctionInt2;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083047 Square table read by antidiagonals forms a permutation of the natural numbers: T(n,0) = floor(n*x/(x-1))+1, T(n,k+1) = ceiling(x*T(n,k)), where x = (sqrt(5)+1)/2, n&gt;=0, k&gt;=0.
 * @author Sean A. Irvine
 */
public class A083047 extends Sequence0 {

  private static final CR PHI1 = CR.PHI.subtract(1);
  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return CR.PHI.multiply(n).divide(PHI1).floor().add(1);
      }
      return CR.PHI.multiply(get(n, m - 1)).ceil();
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
