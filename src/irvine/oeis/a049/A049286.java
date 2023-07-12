package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049286 Triangle of partitions v(d,c) defined in A002572.
 * @author Sean A. Irvine
 */
public class A049286 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A049286() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long c, final Long d) {
    if (d < 0 || c < 0) {
      return Z.ZERO;
    }
    if (c.equals(d)) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * c; ++k) {
      sum = sum.add(get(k, d - c));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mM, mN);
  }
}
