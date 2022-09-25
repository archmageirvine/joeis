package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059434 Triangle formed when cumulative boustrophedon transform is applied to 1, 1, 1, 1, ..., read by rows in natural order.
 * @author Sean A. Irvine
 */
public class A059434 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (m < 1 || m > n) {
      return Z.ZERO;
    }
    return get(n, m - 1).add(Integers.SINGLETON.sum(1, m, k -> get(n - 1, n - k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
