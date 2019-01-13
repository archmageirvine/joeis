package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000356.
 * @author Sean A. Irvine
 */
public class A000356 implements Sequence {

  private int mN = 0;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(2 * mN)
      .divide(mF.factorial(mN)).divide(mF.factorial(mN))
      .multiply(mF.factorial(2 * mN + 1))
      .divide(mF.factorial(mN + 1))
      .divide(mF.factorial(mN + 2));
  }
}
