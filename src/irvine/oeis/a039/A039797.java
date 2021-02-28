package irvine.oeis.a039;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039797 Triangle of numbers of Dyck paths.
 * @author Sean A. Irvine
 */
public class A039797 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
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
