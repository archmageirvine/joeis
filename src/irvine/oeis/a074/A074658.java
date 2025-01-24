package irvine.oeis.a074;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074658 Number of 'convex' partitions of n; i.e., partitions of n for which the Ferrers graph is the intersection of a convex set and the integer lattice.
 * @author Sean A. Irvine
 */
public class A074658 extends Sequence0 {

  private int mN = -1;

  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int m, final int r, final int s) {
      if (n == 1 && m == 1 & r == 0 && s == 0) {
        return Z.ONE;
      }
      final int nn = n - m * s + (r + 1) * (s - 1) / 2;
      if (Functions.GCD.l(r, s) != 1 || 2 * r * n > (m + 1) * (2 * r + s * m) || (nn < m - r)) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int rr = 0; rr < m - r; ++rr) {
        for (int ss = 0; ss <= nn - m + r; ++ss) {
          if (s * rr >= r * ss) {
            sum = sum.add(get(nn, m - r, rr, ss));
          }
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int m = 1; m <= mN; ++m) {
      for (int r = 0; r < m; ++r) {
        for (int s = 0; s <= mN - m; ++s) {
          sum = sum.add(mB.get(mN, m, r, s));
        }
      }
    }
    return sum;
  }
}
