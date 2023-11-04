package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066535 Number of ways of writing n as a sum of n squares.
 * @author Sean A. Irvine
 */
public class A066535 extends Sequence0 {

  private int mN = -1;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n < 0 || m < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int k = 1; k * k <= n; ++k) {
        sum = sum.add(get(n - k * k, m - 1));
      }
      return sum.multiply2().add(get(n, m - 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
