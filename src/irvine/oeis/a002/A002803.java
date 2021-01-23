package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A002803 (2n+4)!/(4!n!(n+1)!).
 * @author Sean A. Irvine
 */
public class A002803 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(2 * mN + 4)
      .divide(mF.factorial(mN))
      .divide(mF.factorial(mN + 1))
      .divide(24);
  }
}

