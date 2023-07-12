package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A046739 Triangle read by rows, related to number of permutations of [n] with 0 successions and k rises.
 * @author Sean A. Irvine
 */
public class A046739 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A046739() {
    super(1);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n <= 0 || m <= 0 || m > n) {
      return Z.ZERO;
    }
    if (n.equals(m)) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(m).add(get(n - 1, m - 1).multiply(n + 1 - m)).add(get(n - 2, m - 1).multiply(n));
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
