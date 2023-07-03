package irvine.oeis.a032;

import irvine.math.LongUtils;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A032020 Number of compositions (ordered partitions) of n into distinct parts.
 * @author Sean A. Irvine
 */
public class A032020 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k <= 0 || n <= 0) {
      return n == 0 && k == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n - k, k).add(get(n - k, k - 1).multiply(k));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (LongUtils.sqrt(8 * mN + 1) - 1) / 2; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
