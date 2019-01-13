package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004537.
 * @author Sean A. Irvine
 */
public class A004537 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z46 = Z.valueOf(46);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> delta8 = ThetaFunctions.delta8(mN);
    final QPolynomial<Z> a = RING.subtract(RING.pow(theta3, 23, mN), RING.multiply(RING.multiply(RING.pow(theta3, 15, mN), delta8, mN), Z46));
    return a.coeff(mN);
  }
}
