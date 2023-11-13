package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066840 Sum of positive integers k where k &lt;= n/2 and gcd(k,n) = 1.
 * @author Sean A. Irvine
 */
public class A066840 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN / 2; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        sum = sum.add(k);
      }
    }
    return sum;
  }
}
