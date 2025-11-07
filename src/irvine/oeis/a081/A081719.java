package irvine.oeis.a081;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081719 Triangle T(n,k) read by rows, related to Fa\u00e0 di Bruno's formula (n &gt;= 0 and 0 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A081719 extends Sequence0 {

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
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      if (m == 0) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(m - 1, n - 1, k -> get(k, m - 1).multiply(mP.get(n + 1, k + 1)));
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
