package irvine.oeis.a068;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067845.
 * @author Sean A. Irvine
 */
public class A068218 extends Sequence0 {

  // After Jean-Fran&ccedil;ois Alcover

  private int mN = -1;
  private int mM = 0;

  private Z a069466(final int n, final int m) {
    return Binomial.binomial(2L * n, n).multiply(Binomial.binomial(n, m).square());
  }

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      Z s = a069466(n, m);
      for (int i = 1; i < n; ++i) {
        final int k = i;
        s = s.subtract(Integers.SINGLETON.sum(0, m, j -> get(k, j).multiply(a069466(n - k, m - j))));
      }
      return s;
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
