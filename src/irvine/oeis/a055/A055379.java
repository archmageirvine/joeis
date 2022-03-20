package irvine.oeis.a055;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055379 16*a(n) gives theta series of the shadow of the 24-dimensional odd Leech lattice.
 * @author Sean A. Irvine
 */
public class A055379 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Z Z16 = Z.valueOf(16);
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> theta4 = ThetaFunctions.theta4(mN).substitutePower(2);
    return RING.add(RING.multiply(RING.add(RING.pow(theta2, 24, mN),
        RING.multiply(RING.multiply(RING.pow(theta4, 8, mN), RING.pow(theta2, 16, mN), mN), Z.THREE)), Z16),
      RING.multiply(RING.multiply(RING.pow(theta4, 16, mN), RING.pow(theta2, 8, mN), mN), Z.THREE))
      .coeff(mN).divide(256);
  }
}
