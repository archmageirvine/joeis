package irvine.oeis.a006;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006151.
 * @author Sean A. Irvine
 */
public class A006151 implements Sequence {

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
      .multiply(mF.factorial(2 * mN + 6))
      .divide(mF.factorial(mN + 3))
      .multiply(mF.factorial(2 * mN + 8))
      .divide(mF.factorial(mN + 4))
      .multiply(1316818944000L)
      .divide(mF.factorial(mN + 9))
      .divide(mF.factorial(mN + 8))
      .divide(mF.factorial(mN + 7))
      .divide(mF.factorial(mN + 6))
      .divide(mF.factorial(mN + 5));
  }
}

