package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000959;
import irvine.oeis.memory.MemorySequence;

/**
 * A066920 Number of partitions of n into lucky parts.
 * @author Sean A. Irvine
 */
public class A066920 extends Sequence1 {

  private final MemorySequence mLucky = MemorySequence.cachedSequence(new A000959());
  private long mN = 0;

  private Z partitions(final long n, final MemorySequence parts, final int pos) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = pos; parts.a(k).longValueExact() <= n; ++k) {
      sum = sum.add(partitions(n - parts.a(k).longValue(), parts, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    return partitions(++mN, mLucky, 0);
  }
}

