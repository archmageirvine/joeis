package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060058 Triangle of numbers related to A000330 (sum of squares) and A000364 (Euler numbers).
 * @author Sean A. Irvine
 */
public class A060058 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    return get(n - 1, m).add(get(n, m - 1).multiply(Z.valueOf(n + 1 - m).square()));
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
