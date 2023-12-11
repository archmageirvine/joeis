package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059432 Triangle formed when cumulative boustrophedon transform is applied to 1, 0, 0, 0, ..., read by rows in natural order.
 * @author Sean A. Irvine
 */
public class A059432 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
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
