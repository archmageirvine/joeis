package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A056742 phi[(2^n - 1)]/2.
 * @author Sean A. Irvine
 */
public class A056742 extends Sequence2 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.multiply2();
    return Functions.PHI.z(mN.subtract(1)).divide2();
  }
}
