package irvine.oeis.a008;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A008289 Triangle read by rows: Q(n,m) = number of partitions of n into m distinct parts, n&gt;=1, m&gt;=1.
 * @author Sean A. Irvine
 */
public class A008289 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A008289() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k <= 0 || n <= 0) {
      return Z.ZERO;
    }
    if (n == 1 && k == 1) {
      return Z.ONE;
    }
    return get(n - k, k).add(get(n - k, k - 1));
  }

  @Override
  public Z next() {
    if (++mM > (LongUtils.sqrt(8 * mN + 1) - 1) / 2) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
