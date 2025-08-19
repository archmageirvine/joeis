package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079501 Number of compositions of the integer n with strictly smallest part in the first position.
 * @author Sean A. Irvine
 */
public class A079501 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = m + 1; k <= n; ++k) {
        if (n - k <= 0 || n - k > m) {
          sum = sum.add(get(n - k, m));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.add(Integers.SINGLETON.sum(1, mN / 2, k -> mB.get(mN - k, k)));
  }
}
