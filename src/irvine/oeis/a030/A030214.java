package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030214 Expansion of <code>eta(q^7)*eta(q^17)</code>.
 * @author Sean A. Irvine
 */
public class A030214 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X7 = RING.monomial(Z.ONE, 7);
  private static final Polynomial<Z> X17 = RING.monomial(Z.ONE, 17);
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    return RING.multiply(RING.eta(X7, mN), RING.eta(X17, mN), mN).coeff(mN);
  }
}
