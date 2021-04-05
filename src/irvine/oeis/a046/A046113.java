package irvine.oeis.a046;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046113 Coefficients in expansion of theta_3(q) * theta_3(q^6) in powers of q.
 * @author Sean A. Irvine
 */
public class A046113 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> theta3 = ThetaFunctions.theta3z(++mN);
    return RING.multiply(theta3, theta3.substitutePower(6, mN), mN).coeff(mN);
  }
}
