package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a050.A050186;

/**
 * A051201 Sum of elements of the set { [ n/k ] : 1 &lt;= k &lt;= n }.
 * @author Sean A. Irvine
 */
public class A051201 extends A050186 {

  /** Construct the sequence. */
  public A051201() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    final Z m = CR.valueOf(4 * ++mN + 1).sqrt().subtract(CR.ONE).divide(CR.TWO).floor();
    Z sum = m.multiply(m.add(1)).divide2();
    for (long k = 1; k <= mN / (m.longValueExact() + 1); ++k) {
      sum = sum.add(mN / k);
    }
    return sum;
  }
}
