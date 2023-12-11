package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026824 Number of partitions of n into distinct parts, the least being 3.
 * @author Sean A. Irvine
 */
public class A026824 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -leastPart() - 1;

  protected long leastPart() {
    return 3;
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    if ((m - leastPart()) * (m + leastPart() + 1) < 2 * n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= Math.min(1, n / m); ++k) {
      sum = sum.add(get(n - m * k, m - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
