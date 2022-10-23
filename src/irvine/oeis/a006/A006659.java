package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006659 Number of closed meander systems of order n+1 with n components.
 * @author Sean A. Irvine
 */
public class A006659 extends Sequence1 {

  long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN + 2, mN - 1).multiply2();
  }
}
