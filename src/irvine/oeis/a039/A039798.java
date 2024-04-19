package irvine.oeis.a039;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039798 Triangle read by rows: numbers of Dyck paths.
 * @author Sean A. Irvine
 */
public class A039798 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return Functions.FACTORIAL.z(2 * mN - mM)
      .divide(Functions.FACTORIAL.z(mN - mM))
      .multiply(Functions.FACTORIAL.z(2 * mN - mM + 2))
      .divide(Functions.FACTORIAL.z(mN - mM + 1))
      .multiply(mM + 1)
      .multiply(mM + 2)
      .multiply(mM + 3)
      .divide(Functions.FACTORIAL.z(mN + 2))
      .divide(Functions.FACTORIAL.z(mN + 3));
  }
}
