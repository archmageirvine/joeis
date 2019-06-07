package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018806 Sum of <code>gcd(x, y)</code> for <code>1 &lt;=</code> x, <code>y &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A018806 implements Sequence {

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
