package irvine.oeis.a081;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081718 Array T(m,n) read by antidiagonals, where T(m,n) = number of m X infinity multiplicity integer partition (mip) matrix of n (m &gt;= 0, n &gt;= 0).
 * @author Sean A. Irvine
 */
public class A081718 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mP = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0 || n == m) {
        return Z.ONE;
      }
      if (m <= 0 || m > n) {
        return Z.ZERO;
      }
      return get(n - 1, m - 1).add(get(n - m, m));
    }
  };
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m <= 1 ? Z.ONE : Z.ZERO;
      }
      return Integers.SINGLETON.sum(0, m, k -> get(n - 1, k).multiply(mP.get(m, k)));
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
