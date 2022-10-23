package irvine.oeis.a004;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004534 Theta series of {D_14}^{+} lattice.
 * @author Sean A. Irvine
 */
public class A004534 extends Sequence0 {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Q n = new Q(mN, 2);
    final QPolynomial<Z> theta2 = RING.pow(ThetaFunctions.theta2(mN), 14, mN / 2 + 1);
    final QPolynomial<Z> theta3 = RING.pow(ThetaFunctions.theta3(mN), 14, mN / 2 + 1);
    final QPolynomial<Z> theta4 = RING.pow(ThetaFunctions.theta4(mN), 14, mN / 2 + 1);
    return theta2.coeff(n).add((mN & 1) == 0 ? theta3.coeff(n).add(theta4.coeff(n)) : Z.ZERO).divide2();
  }
}
