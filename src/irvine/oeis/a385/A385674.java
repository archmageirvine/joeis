package irvine.oeis.a385;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385674 allocated for Natalia L. Skirrow.
 * @author Sean A. Irvine
 */
public class A385674 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == k) {
        return Z.ONE;
      }
      Z s = Z.ZERO;
      for (int j = 1; j <= Math.min(k, n - k); ++j) {
        s = s.or(get(n - j, k));
      }
      return s.add(1);
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
