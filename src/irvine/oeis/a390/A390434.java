package irvine.oeis.a390;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390434 Triangle read by rows, Lah numbers with level 3.
 * @author Sean A. Irvine
 */
public class A390434 extends Sequence0 {

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
      return get(n - 1, m - 1).add(get(n - 1, m).multiply(Z.valueOf(n + m - 1).pow(3)));
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
