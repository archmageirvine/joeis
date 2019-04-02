package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004010 Theta series of 12-dimensional Coxeter-Todd lattice K_12.
 * @author Sean A. Irvine
 */
public class A004010 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z18 = Z.valueOf(18);
  private static final Z Z45 = Z.valueOf(45);
  private int mN = -2;

  private QPolynomial<Z> phi0(final int n) {
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(n);
    final QPolynomial<Z> b = RING.multiply(theta2.substitutePower(2), theta2.substitutePower(6), n);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(n);
    final QPolynomial<Z> a = RING.multiply(theta3.substitutePower(2), theta3.substitutePower(6), n);
    return RING.add(b, a);
  }

  private QPolynomial<Z> phi1(final int n) {
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(n);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(n);
    final QPolynomial<Z> b = RING.multiply(theta2.substitutePower(2), theta3.substitutePower(6), n);
    final QPolynomial<Z> a = RING.multiply(theta3.substitutePower(2), theta2.substitutePower(6), n);
    // terms will be still in powers of 4 space
    return RING.add(b, a);
  }

  @Override
  public Z next() {
    mN += 2;
    final QPolynomial<Z> phi0 = phi0(mN).substitutePower(2);
    final QPolynomial<Z> phi1 = phi1(mN).substitutePower(2);
    final QPolynomial<Z> a = RING.pow(phi0, 6, mN);
    final QPolynomial<Z> b = RING.multiply(RING.multiply(RING.pow(phi0, 2, mN), RING.pow(phi1, 4, mN), mN), Z45);
    final QPolynomial<Z> c = RING.multiply(RING.pow(phi1, 6, mN), Z18);
    final QPolynomial<Z> d = RING.add(a, RING.add(b, c));
    return d.coeff(mN);
  }
}
