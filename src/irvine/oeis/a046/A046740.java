package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A046740 Triangle of number of permutations of [n] with 0 successions, by number of rises.
 * @author Sean A. Irvine
 */
public class A046740 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A046740() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 1) {
      return Z.ONE;
    }
    if (n <= 0 || m <= 0 || m >= n) {
      return Z.ZERO;
    }
    return get(n - 1, m).multiply(m).add(get(n - 1, m - 1).multiply(n - m)).add(get(n - 2, m - 1).multiply(n - 2));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
