package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030201 Expansion of <code>eta(q^3)*eta(q^21)</code>.
 * @author Sean A. Irvine
 */
public class A030201 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    final Polynomial<Z> eta3 = RING.eta(X3, mN);
    return RING.multiply(eta3, eta3.substitutePower(7, mN), mN).coeff(mN);
  }
}
