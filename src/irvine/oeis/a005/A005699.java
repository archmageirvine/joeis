package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005699 tan(n)^2 rounded up.
 * @author Sean A. Irvine
 */
public class A005699 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
    return tan.multiply(tan).ceil();
  }
}
