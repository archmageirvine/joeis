package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071950 Triangle read by rows of numbers of paths in a lattice satisfying certain conditions.
 * @author Sean A. Irvine
 */
public class A071950 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0 && m == 0) {
        return Z.ONE;
      }
      if (m < 0 || m > n / 2) {
        return Z.ZERO;
      }
      return get(n, m + 1).add(get(n - 1, m)).add(get(n - 1, m + 1)).add(get(n - 2, m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mN / 2 - mM);
  }
}
