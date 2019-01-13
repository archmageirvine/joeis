package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006587.
 * @author Sean A. Irvine
 */
public class A006587 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(3 * mN).divide(mF.factorial(2 * mN)).multiply(3).shiftLeft(2 * mN).divide(mF.factorial(mN));
  }
}
