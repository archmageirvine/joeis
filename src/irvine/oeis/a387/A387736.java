package irvine.oeis.a387;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387736 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A387736 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n < 0 || m < 2) {
        return Z.ZERO;
      }
      return get(n, m - 1).add(get(n - m, m - 2));
    }
  };

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN / 2, k -> mN - k >= 2 ? mB.get(k, mN - k - 2) : Z.ZERO);
  }
}

