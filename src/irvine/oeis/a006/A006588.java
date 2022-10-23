package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006588 a(n) = 4^n*(3*n)!/((2*n)!*n!).
 * @author Sean A. Irvine
 */
public class A006588 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(3 * mN).divide(mF.factorial(2 * mN)).shiftLeft(2 * mN).divide(mF.factorial(mN));
  }
}
