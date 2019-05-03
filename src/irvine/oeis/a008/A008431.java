package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008431 Theta series of <code>D_9</code> lattice.
 * @author Sean A. Irvine
 */
public class A008431 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = new Q(-2);

  @Override
  public Z next() {
    mN = mN.add(Q.TWO);
    return RING.pow(ThetaFunctions.theta4(mN), 9, mN).coeff(mN).add(RING.pow(ThetaFunctions.theta3(mN), 9, mN).coeff(mN)).divide2();
  }
}
