package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027743 Number of primitive polynomials of degree n over GF(7).
 * @author Sean A. Irvine
 */
public class A027743 extends Sequence0 {

  private int mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mT = mT.multiply(7);
    return Functions.PHI.z(mT.subtract(1)).divide(mN);
  }
}
