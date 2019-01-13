package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003783.
 * @author Sean A. Irvine
 */
public class A003783 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z120 = Z.valueOf(120);
  private static final Z Z128 = Z.valueOf(128);
  private static final Z Z240 = Z.valueOf(240);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> theta33 = RING.pow(theta3, 3, mN);
    final QPolynomial<Z> theta34 = RING.pow(theta3, 4, mN);
    final QPolynomial<Z> theta38 = RING.pow(theta34, 2, mN);
    final QPolynomial<Z> theta312 = RING.multiply(theta38, theta34, mN);
    final QPolynomial<Z> theta24 = RING.pow(ThetaFunctions.theta2(mN), 4, mN);
    final QPolynomial<Z> theta28 = RING.pow(theta24, 2, mN);
    final QPolynomial<Z> theta212 = RING.multiply(theta24, theta28, mN);
    final QPolynomial<Z> z = RING.subtract(RING.add(RING.subtract(RING.multiply(theta312, Z128), RING.multiply(RING.multiply(theta38, theta24, mN), Z240)), RING.multiply(RING.multiply(theta34, theta28 , mN), Z120)), RING.multiply(theta212, Z.SEVEN));
    return RING.multiply(z, theta33, mN).coeff(mN).divide(128);
  }
}
