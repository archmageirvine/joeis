package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030219 Expansion of (eta(q^5)*eta(q^7))^2.
 * @author Sean A. Irvine
 */
public class A030219 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X5 = RING.monomial(Z.ONE, 5);
  private static final Polynomial<Z> X7 = RING.monomial(Z.ONE, 7);
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    return RING.pow(RING.multiply(RING.eta(X5, mN), RING.eta(X7, mN), mN), 2, mN).coeff(mN);
  }
}
