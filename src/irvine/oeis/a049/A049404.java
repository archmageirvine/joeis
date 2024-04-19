package irvine.oeis.a049;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A049404 Triangle read by rows, the Bell transform of n!*binomial(2,n) (without column 0).
 * @author Sean A. Irvine
 */
public class A049404 extends A049324 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).divide(Z.THREE.pow(mN - mM));
  }
}
