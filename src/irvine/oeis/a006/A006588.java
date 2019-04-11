package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006588 <code>a(n) = 4^n*(3*n)!/((2*n)!*n!)</code>.
 * @author Sean A. Irvine
 */
public class A006588 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(3 * mN).divide(mF.factorial(2 * mN)).shiftLeft(2 * mN).divide(mF.factorial(mN));
  }
}
