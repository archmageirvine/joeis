package irvine.oeis.a390;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390488 Number of partitions of n into distinct parts where each part is at most the sum of the previous two.
 * @author Sean A. Irvine
 */
public class A390488 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int x, final int y, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i > n || i > x + y) {
        return Z.ZERO;
      }
      return get(n - i, y, i, i + 1).add(get(n, x, y, i + 1));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, mN, 1);
  }
}

