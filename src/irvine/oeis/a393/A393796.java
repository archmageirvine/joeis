package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393796 a(n) is the number of different ways to move from A to B along grid paths in an equilateral triangular grid ABC of side n units such that the distance between A and each successive point of the path increases.
 * @author Sean A. Irvine
 */
public class A393796 extends Sequence0 {

  private static final int[] DELTA_X = {-1,  0, -1, 1};
  private static final int[] DELTA_Y = {0, -1, 1, -1};
  private int mN = -1;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    private boolean isInTriangle(final int x, final int y) {
      // Check that particle remains inside the triangle.
      return x >= 0 && y >= 0 && x + y <= mN;
    }

    private boolean check(final int x0, final int y0, final int x1, final int y1) {
      if (!isInTriangle(x1, y1)) {
        return false;
      }
      // Check the distance from the origin increases
      final int d0 = x0 * x0 + y0 * y0 + x0 * y0;
      final int d1 = x1 * x1 + y1 * y1 + x1 * y1;
      return d1 > d0;
    }


    @Override
    protected Z compute(final int x, final int y) {
      if (x == 0 && y == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 0; k < DELTA_X.length; ++k) {
        final int nx = x + DELTA_X[k];
        final int ny = y + DELTA_Y[k];
        if (check(nx, ny, x, y)) {
          sum = sum.add(get(nx, ny));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}

