package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A005895 Weighted count of partitions with distinct parts.
 * @author Sean A. Irvine
 */
public class A005895 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A005895() {
    super(1);
  }

  // After Alois P. Heinz

  private long mN = 0;

  @Override
  protected Z compute(final Long n, final Long i) {
    if (n > i * (i + 1) / 2) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    Z b = get(n, i - 1);
    if (i <= n) {
      b = b.add(get(n - i, Math.min(n - i, i - 1)));
    }
    return b;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long j = 1; j <= mN; ++j) {
      sum = sum.add(get(mN - j, Math.min(mN - j, j - 1)).multiply(j));
    }
    return sum;
  }
}
