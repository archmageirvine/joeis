package irvine.oeis.a004;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004533.
 * @author Sean A. Irvine
 */
public class A004533 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta2 = RING.pow(ThetaFunctions.theta2(4 * mN), 12, 4 * mN);
    final QPolynomial<Z> theta3 = RING.pow(ThetaFunctions.theta3(mN), 12, mN);
    final QPolynomial<Z> theta4 = RING.pow(ThetaFunctions.theta4(mN), 12, mN);
    return theta2.coeff(mN).add(theta3.coeff(mN)).add(theta4.coeff(mN)).divide2();
  }
}
