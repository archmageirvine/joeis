package irvine.oeis.a008;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A008296 Triangle of Lehmer-Comtet numbers of the first kind.
 * @author Sean A. Irvine
 */
public class A008296 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n.equals(k)) {
      return Z.ONE;
    }
    if (k < 0 || k > n) {
      return Z.ZERO;
    }
    return get(n - 2, k - 1).multiply(n - 1).add(get(n - 1, k - 1)).add(get(n - 1, k).multiply(k - n + 1));
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
