package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007730.
 * @author Sean A. Irvine
 */
public class A007730 extends MemoryFunction2<Long, Z> implements Sequence {

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
    for (long j = 0; j < 7; ++j) {
      final long t = n - (j << i);
      if (t >= 0) {
        sum = sum.add(get(t, i - 1));
      }
    }
    return sum;
  }
  @Override
  public Z next() {
    return get(++mN, LongUtils.lg(mN));
  }
}
