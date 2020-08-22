package irvine.oeis.a025;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025604 Number of n-move queen paths on 8x8 board from given corner to same corner.
 * @author Sean A. Irvine
 */
public class A025604 extends MemoryFunctionInt3<Z> implements Sequence {

  // After Alois P. Heinz

  private static final int[] DELTA_X = {1, 1, -1, -1, 0, 0, 1, -1};
  private static final int[] DELTA_Y = {1, -1, 1, -1, 1, -1, 0, 0};
  private int mN = -1;

  @Override
  protected Z compute(final int n, final int i, final int j) {
    if (n < 0 || i < 0 || i > 7 || j < 0 || j > 7) {
      return Z.ZERO;
    }
    if (n == 0 && i == 0 && j == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int d = 0; d < DELTA_X.length; ++d) {
      for (int t = 1; t < 8; ++t) {
        sum = sum.add(get(n - 1, i + t * DELTA_X[d], j + t * DELTA_Y[d]));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 0, 0);
  }
}
