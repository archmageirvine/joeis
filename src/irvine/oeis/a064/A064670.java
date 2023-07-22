package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064670 Triangle T(n,k) (1 &lt;= k &lt;= n) where the first column (T(n,1)) is the sequence of secant numbers A000364.
 * @author Sean A. Irvine
 */
public class A064670 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m < 1 || m > n) {
        return Z.ZERO;
      }
      if (n == 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(m - 1, n - 1, k -> get(n - 1, k)).multiply((long) m * m);
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
