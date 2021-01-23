package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a001.A001790;

/**
 * A038534 Numerators of coefficients of EllipticK/Pi.
 * @author Sean A. Irvine
 */
public class A038534 extends A001790 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
