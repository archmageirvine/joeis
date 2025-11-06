package irvine.oeis.a081;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081658 Triangle read by rows: T(n, k) = (-2)^k*binomial(n, k)*Euler(k, 1/2).
 * @author Sean A. Irvine
 */
public class A081658 extends Sequence0 {
  
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return Z.ONE;
      }
      if ((m & 1) == 1) {
        return Z.ZERO;
      }
      if (m == n) {
        Z sum = Z.ZERO;
        for (int j = 0; j < n; j += 2) {
          sum = sum.subtract(get(n, j));
        }
        return sum;
      }
      return get(n - 1, m).multiply(n).divide(n - m);
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
