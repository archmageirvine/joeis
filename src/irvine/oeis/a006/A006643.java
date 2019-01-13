package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003636;
import irvine.oeis.a089.A089269;

/**
 * A006643.
 * @author Sean A. Irvine
 */
public class A006643 extends A089269 {

  @Override
  public Z next() {
    return Z.valueOf(A003636.classNumber(A003636.forms(-4 * super.next().longValueExact())));
  }
}
