package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A049385 Triangle of numbers related to triangle A049375; generalization of Stirling numbers of second kind A008277, Lah-numbers A008297...
 * @author Sean A. Irvine
 */
public class A049385 extends A049375 {


  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).divide(Z.FIVE.pow(mN - mM));
  }
}
