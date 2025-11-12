package irvine.oeis.a390;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390433 allocated for Aleks Zigon Tankosic.
 * @author Sean A. Irvine
 */
public class A390433 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == m) {
        return Z.ONE;
      }
      if (m > n || m <= 0) {
        return Z.ZERO;
      }
      return get(n - 1, m - 1).add(get(n - 1, m).multiply(n + m - 1).multiply(n + m - 1));
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
