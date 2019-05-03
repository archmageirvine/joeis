package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003636;
import irvine.oeis.a089.A089269;

/**
 * A006643 Class number of quadratic field with discriminant <code>-4n</code> as n runs through <code>A089269</code>: squarefree numbers congruent to 1 or <code>2 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A006643 extends A089269 {

  @Override
  public Z next() {
    return Z.valueOf(A003636.classNumber(A003636.forms(-4 * super.next().longValueExact())));
  }
}
