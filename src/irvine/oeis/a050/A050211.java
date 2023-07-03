package irvine.oeis.a050;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A050211 Triangle of number of permutations of {1, 2, ..., n} having exactly k cycles, each of which is of length &gt;=r for r=3.
 * @author Sean A. Irvine
 */
public class A050211 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = 2;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 3 || m < 1) {
      return Z.ZERO;
    }
    if (n == 3 && m == 1) {
      return Z.TWO;
    }
    return get(n - 1, m).multiply(n - 1).add(get(n - 3, m - 1).multiply(n - 1).multiply(n - 2));
  }

  @Override
  public Z next() {
    if (++mM > mN / 3) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
