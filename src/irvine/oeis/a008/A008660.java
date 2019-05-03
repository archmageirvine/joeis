package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008660 Theta series of direct sum of 4 copies of <code>D_4</code> lattice.
 * @author Sean A. Irvine
 */
public class A008660 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = new Q(-2);

  protected int copies() {
    return 4;
  }

  @Override
  public Z next() {
    mN = mN.add(Q.TWO);
    final QPolynomial<Z> t1 = RING.pow(ThetaFunctions.theta3(mN), 4, mN);
    final QPolynomial<Z> t2 = RING.pow(ThetaFunctions.theta4(mN), 4, mN);
    return RING.pow(RING.add(t1, t2), copies(), mN).coeff(mN).shiftRight(copies());
  }
}
