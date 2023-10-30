package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066575 LCM of numbers m such that 1 &lt;= m &lt;= n, m has a common factor with n, but m does not divide n.
 * @author Sean A. Irvine
 */
public class A066575 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z lcm = Z.ONE;
    for (long k = 2; k < mN; ++k) {
      final long d = LongUtils.gcd(k, mN);
      if (d > 1 && d != k) {
        lcm = lcm.lcm(k);
      }
    }
    return lcm;
  }
}
