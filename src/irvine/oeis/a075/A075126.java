package irvine.oeis.a075;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075126 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int y, final int t, final int w) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.valueOf(1 - t);
      }
      return (t < 0 ? Z.ZERO : get(n - (w > 0 || t == 0 ? 1 : 2), y + 1, 1, Math.max(0, w - 1)))
        .add(t > 0 || y < 0 ? Z.ZERO : get(n, y - 1, - 1, t == 0 ? 1 : w + 1))
        .add(y < 1 ? Z.ZERO : get(n - (t < 0 ? 1 : 2), y, 0, t < 0 ? w : 0));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0, 1, 0);
  }
}
