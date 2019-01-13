package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008949.
 * @author Sean A. Irvine
 */
public class A008949 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n < 0 || k > n) {
      return Z.ZERO;
    }
    if (k == 0) {
      return Z.ONE;
    }
    if (n.equals(k)) {
      return Z.ONE.shiftLeft(n);
    }
    return get(n - 1, k - 1).add(get(n - 1, k));
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
