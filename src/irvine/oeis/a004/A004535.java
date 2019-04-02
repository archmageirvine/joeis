package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004535 Theta series of 14-dimensional unimodular lattice (E7+E7)+.
 * @author Sean A. Irvine
 */
public class A004535 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Q n = new Q(mN, 2);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> a = RING.add(RING.pow(theta3, 7, mN), RING.multiply(RING.multiply(RING.pow(theta3, 3, mN), RING.pow(theta2, 4, mN), mN), Z.SEVEN));
    final QPolynomial<Z> a2 = RING.pow(a, 2, mN);
    final QPolynomial<Z> b = RING.add(RING.pow(theta2, 7, mN), RING.multiply(RING.multiply(RING.pow(theta2, 3, mN), RING.pow(theta3, 4, mN), mN), Z.SEVEN));
    final QPolynomial<Z> b2 = RING.pow(b, 2, mN);
    return b2.coeff(n).add((mN & 1) == 0 ? a2.coeff(n) : Z.ZERO);
  }
}
