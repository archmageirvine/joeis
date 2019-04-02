package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007059 Number of balanced ordered trees with n nodes.
 * @author Sean A. Irvine
 */
public class A007059 extends MemoryFunction2<Long, Z> implements Sequence {

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if (m == 0) {
      for (long j = 1; j <= n; ++j) {
        sum = sum.add(get(n - j, j));
      }
    } else {
      for (int j = 1; j <= Math.min(n, m); ++j) {
        sum = sum.add(get(n - j, Math.min(n - j, m)));
      }
    }
    return sum;
  }

  private long mN = -2;

  @Override
  public Z next() {
    return get(++mN, 0L);
  }
}
