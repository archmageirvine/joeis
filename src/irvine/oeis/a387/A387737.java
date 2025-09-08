package irvine.oeis.a387;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079941.
 * @author Sean A. Irvine
 */
public class A387737 extends Sequence1 {

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
    final int i = n - k * k;
    final int j = (n + 1) / 2 - k;
    return mB.get(i, i, k).subtract(mB.get(i, j - 1, k));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k * k <= mN; ++k) {
      sum = sum.add(p(mN, k));
    }
    return sum;
  }
}

