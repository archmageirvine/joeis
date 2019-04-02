package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008663 Theta series of direct sum of 2 copies of f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A008663 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = new Q(-2);

  protected int copies() {
    return 2;
  }

  @Override
  public Z next() {
    mN = mN.add(Q.TWO);
    final QPolynomial<Z> t1 = RING.pow(ThetaFunctions.theta3(mN), 3, mN);
    final QPolynomial<Z> t2 = RING.pow(ThetaFunctions.theta4(mN), 3, mN);
    return RING.pow(RING.add(t1, t2), copies(), mN).coeff(mN).shiftRight(copies());
  }
}
