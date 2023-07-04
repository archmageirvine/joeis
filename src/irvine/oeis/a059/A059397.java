package irvine.oeis.a059;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Z;

/**
 * A059397 Triangle formed by right-bounded rhombus rule, read by rows.
 * @author Sean A. Irvine
 */
public class A059397 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (n <= 1) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).add(get(n - 1, m)).add(get(n - 1, m + 1)).add(get(n - 2, m));
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return get(mN, mM);
  }
}
