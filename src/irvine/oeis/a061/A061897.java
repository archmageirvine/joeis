package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061897 Square table by antidiagonals of number of routes of length 2k+n on the sides of a 2n-gon from a point to its opposite point.
 * @author Sean A. Irvine
 */
public class A061897 extends Sequence0 {

  private final A061896 mA = new A061896();
  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return n == 0 ? Z.ONE : Z.TWO;
      }
      Z sum = Z.ZERO;
      if (m > 0) {
        for (int j = 1; j <= n / 2; ++j) {
          sum = sum.signedAdd((j & 1) == 1, get(n, m - j).multiply(mA.compute(n, j)));
        }
      }
      return sum;
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
