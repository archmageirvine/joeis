package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006587 a(n) = 3*2^(2*n)*(3*n)!/((2*n)!*n!).
 * @author Sean A. Irvine
 */
public class A006587 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(3 * mN).divide(Functions.FACTORIAL.z(2 * mN)).multiply(3).shiftLeft(2L * mN).divide(Functions.FACTORIAL.z(mN));
  }
}
