package irvine.oeis.a034;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034896 Number of solutions to a^2 + b^2 + 3*c^2 + 3*d^2 = n.
 * @author Sean A. Irvine
 */
public class A034896 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> t3 = ThetaFunctions.theta3z(mN);
    final Polynomial<Z> g = RING.pow(RING.multiply(t3, t3.substitutePower(3, mN), mN), 2, mN);
    return g.coeff(mN);
  }
}
