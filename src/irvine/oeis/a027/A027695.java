package irvine.oeis.a027;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027695 Number of primitive polynomials of degree n over GF(4).
 * @author Sean A. Irvine
 */
public class A027695 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Euler.phi(Z.ONE.shiftLeft(2L * mN).subtract(1)).divide(mN);
  }
}
