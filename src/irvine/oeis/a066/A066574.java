package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066574 LCM of numbers &lt;= n and having a factor in common with n.
 * @author Sean A. Irvine
 */
public class A066574 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z lcm = Z.valueOf(++mN);
    for (long k = 2; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) > 1) {
        lcm = lcm.lcm(k);
      }
    }
    return lcm;
  }
}
