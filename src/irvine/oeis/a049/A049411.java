package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A049411 Triangle read by rows, the Bell transform of n!*binomial(5,n) (without column 0).
 * @author Sean A. Irvine
 */
public class A049411 extends A049327 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    return super.next().multiply(mF.factorial(mN)).divide(mF.factorial(mM)).divide(Z.SIX.pow(mN - mM));
  }
}
