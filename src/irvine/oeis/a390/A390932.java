package irvine.oeis.a390;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390932 allocated for Noah A Rosenberg.
 * @author Sean A. Irvine
 */
public class A390932 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j < m; ++j) {
        for (int i = j; i <= n - m + j; ++i) {
          sum = sum.add(get(n - i, m - j).multiply(get(i, j)));
        }
      }
      if ((n & 1) == 0 && (m & 1) == 0) {
        sum = sum.add(get(n / 2, m / 2));
      }
      return sum.divide2();
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
