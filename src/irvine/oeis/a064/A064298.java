package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;

/**
 * A064298 Square array read by antidiagonals of self-avoiding rook paths joining opposite corners of n X k board.
 * @author Sean A. Irvine
 */
public class A064298 extends A064297 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m > n) {
        return get(m, n);
      }
      return solve(n + 1, m + 1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM);
  }
}
