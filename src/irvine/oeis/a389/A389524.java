package irvine.oeis.a389;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389524 Triangle read by rows. T(1, 1) = 1, T(n, k) = [n &gt;= k](1 + Sum_{i=1..k-1} T(n - i, k - 1) - Sum_{i=1..n-1} T(n - i, k)).
 * @author Sean A. Irvine
 */
public class A389524 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1) {
        return m == 1 ? Z.ONE : Z.ZERO;
      }
      if (m > n) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, m - 1, k -> get(n - k, m - 1))
        .subtract(Integers.SINGLETON.sum(1, n - 1, k -> get(n - k, m)))
        .add(1);
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

