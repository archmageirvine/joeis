package irvine.oeis.a387;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387738 Number of partitions of n such that the largest part is &gt;= n/2 and if the partition has k parts then the smallest part is &gt;= k+1.
 * @author Sean A. Irvine
 */
public class A387738 extends Sequence1 {

  // todo this is wrong

  private int mN = 0;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int m, final int k) {
      return get(n, m - 1, k).add(get(n - m, m, k - 1));
    }

    @Override
    public Z get(final int n, final int m, final int k) {
      if (n == 0 && m >= 0) {
        return Z.ONE;
      }
      if (n < 0 || m <= 0 || k <= 0) {
        return Z.ZERO;
      }
      return super.get(n, m, k);
    }
  };

  private Z p(final int n, final int k) {
    final int i = n - k * (k + 1);
    final int j = (n + 1) / 2 - k - 1;
    return mB.get(i, i, k).subtract(mB.get(i, j - 1, k));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k * (k + 1) <= mN; ++k) {
      sum = sum.add(p(mN, k));
    }
    return sum;
  }
}

