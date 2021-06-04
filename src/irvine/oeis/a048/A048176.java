package irvine.oeis.a048;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048176 Generalized Stirling number triangle of first kind.
 * @author Sean A. Irvine
 */
public class A048176 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mM = 0;
  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0 || n < m) {
      return Z.ZERO;
    }
    if (n.equals(m)) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).subtract(get(n - 1, m).multiply(10L * n - 10));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}

