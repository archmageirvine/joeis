package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
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
    return Jaguar.factor(Z.ONE.shiftLeft(3 * mN).subtract(1)).phi().divide(mN);
  }
}
