package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002802 a(n) = (2*n+3)!/(6*n!*(n+1)!).
 * @author Sean A. Irvine
 */
public class A002802 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(2 * mN + 3)
      .divide(mF.factorial(mN))
      .divide(mF.factorial(mN + 1))
      .divide(6);
  }
}

