package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062750 Generalized Catalan array FS(4; n,r).
 * @author Sean A. Irvine
 */
public class A062750 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || n < 0 || m > 3 * n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return get(n, m - 1).add(get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > 3 * mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}

