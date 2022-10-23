package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004536 Theta series of 15-dimensional unimodular lattice A15+.
 * @author Sean A. Irvine
 */
public class A004536 extends Sequence0 {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z30 = Z.valueOf(30);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> delta8 = ThetaFunctions.delta8(mN);
    final QPolynomial<Z> a = RING.subtract(RING.pow(theta3, 15, mN), RING.multiply(RING.multiply(RING.pow(theta3, 7, mN), delta8, mN), Z30));
    return a.coeff(mN);
  }
}
