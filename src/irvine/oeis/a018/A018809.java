package irvine.oeis.a018;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A018809 Number of lines through exactly 2 points of an n X n grid of points.
 * @author Sean A. Irvine
 */
public class A018809 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    Z sum = Z.ZERO;
    for (int x = 1; k * x < n; ++x) {
      for (int y = 1; k * y < n; ++y) {
        if (Functions.GCD.i(x, y) == 1) {
          sum = sum.add(Z.valueOf(n - (long) k * x).multiply(n - (long) k * y));
        }
      }
    }
    return sum.multiply(4);
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.SIX;
    }
    return get(mN, 3).subtract(get(mN, 2).multiply2()).add(get(mN, 1)).divide2();
  }
}
