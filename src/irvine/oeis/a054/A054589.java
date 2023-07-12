package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A054589 Table related to labeled rooted trees, cycles and binary trees.
 * @author Sean A. Irvine
 */
public class A054589 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A054589() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m < 0 || m >= n) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(n - 1).add(get(n - 1, m - 1).multiply(n + m - 2));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
