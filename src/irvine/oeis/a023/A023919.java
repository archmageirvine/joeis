package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023919 Theta series of <code>A*_7</code> lattice. Expansion of <code>F_8(q^2)</code>.
 * @author Sean A. Irvine
 */
public class A023919 implements Sequence {

  // todo not quite working

  private static final QPolynomialRing<Z> RINGQ = new QPolynomialRing<>(Integers.SINGLETON);
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> theta3 = ThetaFunctions.theta3z(++mN).substitutePower(2);
    final Polynomial<Z> theta32 = theta3.substitutePower(2, mN);
    final QPolynomial<Z> psi = ThetaFunctions.psi(1, mN).substitutePower(8);
    final Z a = RING.pow(theta32, 7, mN).coeff(mN);
    final Z b = RINGQ.pow(RINGQ.multiply(psi.shift(1), Z.TWO), 7, mN).coeff(mN);
    final Z c = RING.multiply(RING.pow(theta32, 5, mN), RING.pow(theta3, 2, mN)).coeff(mN).multiply(14);
    final Z d = RING.multiply(RING.pow(theta32, 3, mN), RING.pow(theta3, 4, mN), mN).coeff(mN).multiply(-7);
    return a.add(b).add(c).add(d).divide(8);
  }
}
