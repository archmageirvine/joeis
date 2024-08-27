package irvine.oeis.a072;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072030 Array read by antidiagonals: T(n,k) = number of steps in simple Euclidean algorithm for gcd(n,k) where n &gt;= 1, k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A072030 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;

  private final MemoryFunctionInt2<Integer> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Integer compute(final int n, final int m) {
      if (n < 1 || m < 1) {
        return 0;
      }
      if (n == m) {
        return 1;
      }
      return n < m ? mB.get(m, n) : 1 + mB.get(m, n - m);
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mB.get(mM, mN - mM));
  }
}
