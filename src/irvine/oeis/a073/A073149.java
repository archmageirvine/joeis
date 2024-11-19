package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073149 Triangle of numbers arising in recursive computation of A002212.
 * @author Sean A. Irvine
 */
public class A073149 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (m == 0) {
        if (n > 1) {
          return get(n - 1, 0).add(get(n - 1, n - 1));
        } else {
          return Z.ONE;
        }
      }
      return get(n, m - 1).add(get(m, 0).multiply(get(n - m, 0)));
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
