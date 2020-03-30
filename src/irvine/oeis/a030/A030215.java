package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030215 Expansion of <code>eta(q^9)*eta(q^15)</code>.
 * @author Sean A. Irvine
 */
public class A030215 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X9 = RING.monomial(Z.ONE, 9);
  private static final Polynomial<Z> X15 = RING.monomial(Z.ONE, 15);
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    return RING.multiply(RING.eta(X9, mN), RING.eta(X15, mN), mN).coeff(mN);
  }
}
