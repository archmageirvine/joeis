package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018806 Sum of gcd(x, y) for 1 &lt;= x, y &lt;= n.
 * @author Sean A. Irvine
 */
public class A018806 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN / k).square().multiply(LongUtils.phi(k)));
    }
    return sum;
  }
}
