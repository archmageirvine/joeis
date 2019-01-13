package irvine.oeis.a014;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014711.
 * @author Sean A. Irvine
 */
public class A014711 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> theta3z2 = theta3.substitutePower(2);
    final QPolynomial<Z> theta4 = ThetaFunctions.theta4(mN);
    final QPolynomial<Z> theta2z2 = ThetaFunctions.theta2(mN).substitutePower(2);
    final QPolynomial<Z> a = RING.multiply(theta3, theta3z2, mN);
    final QPolynomial<Z> b = RING.multiply(RING.pow(RING.multiply(theta4, theta2z2, mN), 2, mN), Z.FOUR);
    return RING.multiply(RING.pow(a, 6, mN), RING.subtract(RING.pow(a, 2), b), mN).coeff(mN);
  }
}
