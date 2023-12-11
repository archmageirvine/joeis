package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059237 Variation of Boustrophedon transform described in A059219 applied to sequence 0,1,0,0,0,....
 * @author Sean A. Irvine
 */
public class A059237 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int m) {
    if ((n & 1) == 0) {
      if (m == n) {
        return Z.ZERO;
      }
      Z sum = get(n, m + 1);
      for (int row = n - 1; row >= m; --row) {
        sum = sum.add(get(row, m));
      }
      return sum;
    } else {
      if (m == 0) {
        return n == 1 ? Z.ONE : Z.ZERO;
      }
      Z sum = get(n, m - 1);
      for (int row = n - 1; row >= 0 && m >= n - row; --row) {
        sum = sum.add(get(row, m - (n - row)));
      }
      return sum;
    }
  }

  @Override
  public Z next() {
    ++mN;
    return (mN & 1) == 0 ? get(mN, 0) : get(mN, mN);
  }
}
