package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003782.
 * @author Sean A. Irvine
 */
public class A003782 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z11 = Z.valueOf(11);
  private static final Z Z32 = Z.valueOf(32);
  private static final Z Z44 = Z.valueOf(44);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> theta33 = RING.pow(theta3, 3, mN);
    final QPolynomial<Z> theta34 = RING.pow(theta3, 4, mN);
    final QPolynomial<Z> theta38 = RING.pow(theta34, 2, mN);
    final QPolynomial<Z> theta24 = RING.pow(ThetaFunctions.theta2(mN), 4, mN);
    final QPolynomial<Z> theta28 = RING.pow(theta24, 2, mN);
    final QPolynomial<Z> z = RING.add(RING.subtract(RING.multiply(theta38, Z32), RING.multiply(RING.multiply(theta34, theta24, mN), Z44)), RING.multiply(theta28, Z11));
    return RING.multiply(z, theta33, mN).coeff(mN).divide(32);
  }
}
