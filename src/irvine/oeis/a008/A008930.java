package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008930 Number of compositions <code>(p_1, p_2, p_3, ...)</code> of n with <code>1 &lt;= p_i &lt;=</code> i for all i.
 * @author Sean A. Irvine
 */
public class A008930 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long i) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long j = 1; j <= Math.min(i, n); ++j) {
      sum = sum.add(get(n - j, i + 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}
