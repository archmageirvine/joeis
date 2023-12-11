package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A007728 5th binary partition function.
 * @author Sean A. Irvine
 */
public class A007728 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long i) {
    if (n == 0) {
      return Z.ONE;
    }
    if (i < 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j < 5; ++j) {
      final long t = n - (j << i);
      if (t >= 0) {
        sum = sum.add(get(t, i - 1));
      }
    }
    return sum;
  }
  @Override
  public Z next() {
    return get(++mN, LongUtils.log2(mN));
  }
}
