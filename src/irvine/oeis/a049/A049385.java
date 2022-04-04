package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A049385 Triangle of numbers related to triangle A049375; generalization of Stirling numbers of second kind A008277, Lah-numbers A008297...
 * @author Sean A. Irvine
 */
public class A049385 extends A049375 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    return super.next().multiply(mF.factorial(mN)).divide(mF.factorial(mM)).divide(Z.FIVE.pow(mN - mM));
  }
}
