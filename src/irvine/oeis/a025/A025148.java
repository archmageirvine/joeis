package irvine.oeis.a025;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025148.
 * @author Sean A. Irvine
 */
public class A025148 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  protected long parts() {
    return 3;
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if ((m - parts() + 1) * (m + parts()) / 2 < n) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j <= Math.min(1, n / m); ++j) {
      sum = sum.add(get(n - m * j, m - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
