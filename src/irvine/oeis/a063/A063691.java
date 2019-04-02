package irvine.oeis.a063;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063691 Number of solutions to x^2 + y^2 + z^2 = n in positive integers.
 * @author Sean A. Irvine
 */
public class A063691 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> t3 = ThetaFunctions.theta3z(++mN);
    return RING.pow(RING.subtract(t3, RING.one()), 3, mN).coeff(mN).divide(8);
  }
}
