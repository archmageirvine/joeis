package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A050213 Triangle of number of permutations of {1, 2, ..., n} having exactly k cycles, each of which is of length &gt;=r for r=5.
 * @author Sean A. Irvine
 */
public class A050213 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A050213() {
    super(5);
  }

  private long mN = 4;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 5 || m < 1) {
      return Z.ZERO;
    }
    if (n == 5 && m == 1) {
      return Z.valueOf(24);
    }
    return get(n - 1, m).multiply(n - 1).add(get(n - 5, m - 1).multiply(n - 1).multiply(n - 2).multiply(n - 3).multiply(n - 4));
  }

  @Override
  public Z next() {
    if (++mM > mN / 5) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
