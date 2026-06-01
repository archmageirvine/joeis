package irvine.oeis.a395;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a111.A111972;

/**
 * A395312 Triangle read by rows: T(n, k) is the number of partitions of n into parts having exactly k distinct prime factors, with 0 &lt;= k &lt;= A111972(n) for n &gt;= 1 and k = 0 for n = 0.
 * @author Sean A. Irvine
 */
public class A395312 extends Sequence0 {

  private final Sequence mLimSeq = new A111972();
  private int mN = 0;
  private int mM = -1;
  private int mLim = mLimSeq.next().intValueExact();
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int r) {
      if (n == 0 || m == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 1; k <= r; ++k) {
        if (Functions.OMEGA.i(k) == m) {
          sum = sum.add(get(n - k, m, Math.min(k, n - k)));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    if (++mM > mLim) {
      ++mN;
      mLim = mLimSeq.next().intValueExact();
      mM = 0;
    }
    return mB.get(mN, mM, mN);
  }
}
