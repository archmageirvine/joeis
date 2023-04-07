package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062704 Di-Boustrophedon transform of all 1's sequence: Fill in an array by diagonals alternating in the 'up' and 'down' directions. Each diagonal starts with a 1. When going in the 'up' direction the next element is the sum of the previous element of the diagonal and the previous two elements of the row the new element is in. When going in the 'down' direction the next element is the sum of the previous element of the diagonal and the previous two elements of the column the new element is in. The final element of the n-th diagonal is a(n).
 * @author Sean A. Irvine
 */
public class A062704 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;

  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {

    @Override
    protected Z compute(final int n, final int m) {
      if (n < 1 || m < 1) {
        return Z.ZERO;
      }
      if ((n == 1 && (m & 1) == 1) || (m == 1 && (n & 1) == 0)) {
        return Z.ONE;
      }
      if (((n + m) & 1) == 0) {
        return get(n - 1, m + 1).add(get(n - 1, m)).add(get(n - 2, m));
      } else {
        return get(n + 1, m - 1).add(get(n, m - 1)).add(get(n, m - 2));
      }
    }
  };

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? mB.get(1, mN) : mB.get(mN, 1);
  }
}
