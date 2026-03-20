package irvine.oeis.a393;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393796 a(n) is the number of different ways to move from A to B along grid paths in an equilateral triangular grid ABC of side n units such that the distance between A and each successive point of the path increases.
 * @author Sean A. Irvine
 */
public class A393796 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int x, final int y) {
      if (x == 0 && y == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      if (x > 0) {
        sum = sum.add(get(x - 1, y));
      }
      if (y > 0) {
        sum = sum.add(get(x, y - 1));
      }
      if (x > 0 && y < x - 1) {
        sum = sum.add(get(x - 1, y + 1));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}

