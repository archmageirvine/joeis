package irvine.oeis.a039;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039798.
 * @author Sean A. Irvine
 */
public class A039798 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return mF.factorial(2 * mN - mM)
      .divide(mF.factorial(mN - mM))
      .multiply(mF.factorial(2 * mN - mM + 2))
      .divide(mF.factorial(mN - mM + 1))
      .multiply(mM + 1)
      .multiply(mM + 2)
      .multiply(mM + 3)
      .divide(mF.factorial(mN + 2))
      .divide(mF.factorial(mN + 3));
  }
}
