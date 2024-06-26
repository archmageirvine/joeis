package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027744 Number of primitive polynomials of degree n over GF(8).
 * @author Sean A. Irvine
 */
public class A027744 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Functions.PHI.z(Z.ONE.shiftLeft(3L * mN).subtract(1)).divide(mN);
  }
}
