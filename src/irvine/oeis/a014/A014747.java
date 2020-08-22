package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014747 Theta series of lattice D20+.
 * @author Sean A. Irvine
 */
public class A014747 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta2 = RING.pow(ThetaFunctions.theta2(mN), 20, mN);
    final QPolynomial<Z> theta3 = RING.pow(ThetaFunctions.theta3(mN), 20, mN);
    final QPolynomial<Z> theta4 = RING.pow(ThetaFunctions.theta4(mN), 20, mN);
    return RING.add(theta2, RING.add(theta3, theta4)).coeff(mN).divide2();
  }
}

