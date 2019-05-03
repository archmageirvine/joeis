package irvine.oeis.a018;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018809 Number of lines through exactly 2 points of an <code>n X n</code> grid of points.
 * @author Sean A. Irvine
 */
public class A018809 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    Z sum = Z.ZERO;
    for (int x = 1; k * x < n; ++x) {
      for (int y = 1; k * y < n; ++y) {
        if (IntegerUtils.gcd(x, y) == 1) {
          sum = sum.add(Z.valueOf(n - k * x).multiply(n - k * y));
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
