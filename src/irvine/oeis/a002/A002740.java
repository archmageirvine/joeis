package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.factorial.MemoryFactorial;

/**
 * A002740.
 * @author Sean A. Irvine
 */
public class A002740 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    return mF.factorial(2 * (mN - 1))
      .divide2()
      .divide(mF.factorial(mN))
      .divide(mF.factorial(mN - 3));
  }
}
