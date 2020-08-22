package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004532 Theta series of {D_10}^{+} lattice.
 * @author Sean A. Irvine
 */
public class A004532 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Q n = new Q(mN, 2);
    final QPolynomial<Z> theta2 = RING.pow(ThetaFunctions.theta2(n), 10, mN / 2 + 1);
    final QPolynomial<Z> theta3 = RING.pow(ThetaFunctions.theta3(n), 10, mN / 2 + 1);
    final QPolynomial<Z> theta4 = RING.pow(ThetaFunctions.theta4(n), 10, mN / 2 + 1);
    return theta2.coeff(n).add((mN & 1) == 0 ? theta3.coeff(n).add(theta4.coeff(n)) : Z.ZERO).divide2();
  }
}
