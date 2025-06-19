package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A051201 Sum of elements of the set { [ n/k ] : 1 &lt;= k &lt;= n }.
 * @author Sean A. Irvine
 */
public class A051201 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final Z m = n.multiply(4).add(1).sqrt().subtract(1).divide2();
    Z sum = m.multiply(m.add(1)).divide2();
    final long lim = n.divide(m.add(1)).longValueExact();
    for (long k = 1; k <= lim; ++k) {
      sum = sum.add(n.divide(k));
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
