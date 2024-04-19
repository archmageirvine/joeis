package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a046.A046527;

/**
 * A048870 Triangle of coefficients of certain Sheffer-polynomials.
 * @author Sean A. Irvine
 */
public class A048870 extends A046527 {


  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM));
  }
}

