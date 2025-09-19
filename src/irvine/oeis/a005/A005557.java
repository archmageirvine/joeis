package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005557 a(n) is the number of Dyck paths of semilength n+6 having its first peak at height n+1.
 * @author Sean A. Irvine
 */
public class A005557 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 10, 4).multiply(mN + 1).divide(5);
  }
}
