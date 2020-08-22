package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030217 Expansion of eta(q^11)*eta(q^13).
 * @author Sean A. Irvine
 */
public class A030217 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X11 = RING.monomial(Z.ONE, 11);
  private static final Polynomial<Z> X13 = RING.monomial(Z.ONE, 13);
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    return RING.multiply(RING.eta(X11, mN), RING.eta(X13, mN), mN).coeff(mN);
  }
}
