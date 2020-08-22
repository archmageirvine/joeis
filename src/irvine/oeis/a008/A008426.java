package irvine.oeis.a008;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008426 Theta series of {D_10}* lattice.
 * @author Sean A. Irvine
 */
public class A008426 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = Q.HALF.negate();

  @Override
  public Z next() {
    mN = mN.add(Q.HALF);
    return RING.pow(ThetaFunctions.theta2(mN), 10, mN).coeff(mN).add(RING.pow(ThetaFunctions.theta3(mN), 10, mN).coeff(mN));
  }
}
