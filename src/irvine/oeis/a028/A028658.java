package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028658 Expansion of (theta_3(z)*theta_3(23z) + theta_2(z)*theta_2(23z))^2.
 * @author Sean A. Irvine
 */
public class A028658 extends Sequence0 {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  protected int power() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    final int t = (mN + 22) / 23;
    final QPolynomial<Z> a = RING.multiply(ThetaFunctions.theta3(mN), ThetaFunctions.theta3(t).substitutePower(23), mN);
    final QPolynomial<Z> b = RING.multiply(ThetaFunctions.theta2(mN), ThetaFunctions.theta2(t).substitutePower(23), mN);
    return RING.pow(RING.add(a, b), power(), mN).coeff(mN);
  }
}
