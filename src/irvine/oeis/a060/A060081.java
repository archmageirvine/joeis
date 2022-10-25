package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060081 Exponential Riordan array (sech(x), tanh(x)).
 * @author Sean A. Irvine
 */
public class A060081 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return get(n - 1, m - 1).subtract(get(n - 1, m + 1).multiply(Z.valueOf(m + 1).square()));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mA.get(mN, mM);
  }
}
