package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014202 Number of solutions to x^2 + x*y + y^2 &lt;= n, excluding (0,0), divided by 6.
 * @author Sean A. Irvine
 */
public class A014202 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; k += 3) {
      sum = sum.add(mN / k - mN / (k + 1));
    }
    return sum;
  }
}
