package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003636;
import irvine.oeis.a089.A089269;

/**
 * A006643 Class number of quadratic field with discriminant -4n as n runs through A089269: squarefree numbers congruent to 1 or 2 mod 4.
 * @author Sean A. Irvine
 */
public class A006643 extends A089269 {

  @Override
  public Z next() {
    return Z.valueOf(A003636.classNumber(A003636.forms(-4 * super.next().longValueExact())));
  }
}
