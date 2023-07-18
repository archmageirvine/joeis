package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064580 Triangle associated with rooted trees with a degree constraint (A036765).
 * @author Sean A. Irvine
 */
public class A064580 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 0 || m > n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return get(n - 1, m).add(get(n - 1, m - 1)).add(get(n - 1, m - 2)).add(get(n - 1, m - 3));
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

