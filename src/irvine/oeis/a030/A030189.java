package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030189 Expansion of eta(q)*eta(q^2)*eta(q^4)*eta(q^8).
 * @author Sean A. Irvine
 */
public class A030189 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> eta = RING.eta(RING.x(), ++mN);
    return RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(2, mN), mN), eta.substitutePower(4, mN), mN), eta.substitutePower(8, mN), mN).coeff(mN);
  }
}
