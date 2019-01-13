package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006149.
 * @author Sean A. Irvine
 */
public class A006149 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    return mF.factorial(2 * ++mN)
      .divide(mF.factorial(mN))
      .multiply(mF.factorial(2 * mN + 2))
      .divide(mF.factorial(mN + 1))
      .multiply(mF.factorial(2 * mN + 4))
      .divide(mF.factorial(mN + 2))
      .multiply(720)
      .divide(mF.factorial(mN + 5))
      .divide(mF.factorial(mN + 4))
      .divide(mF.factorial(mN + 3));
  }
}

