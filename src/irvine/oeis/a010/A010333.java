package irvine.oeis.a010;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.a003.A003814;

/**
 * A010333.
 * @author Sean A. Irvine
 */
public class A010333 extends A003814 {

  @Override
  public Z next() {
    return Z.valueOf(Convergents.continuedFractionConvergentsSqrt(super.next().longValueExact()).size() - 1);
  }
}
