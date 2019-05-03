package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005930 Theta series of <code>D_5</code> lattice.
 * @author Sean A. Irvine
 */
public class A005930 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int lim = 2 * mN;
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(lim);
    final QPolynomial<Z> theta4 = ThetaFunctions.theta4(lim);
    final QPolynomial<Z> t = RING.add(RING.pow(theta3.substitutePower(Q.HALF), 5, mN), RING.pow(theta4.substitutePower(Q.HALF), 5, mN));
    return t.coeff(mN).divide2();
  }
}
