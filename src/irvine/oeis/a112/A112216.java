package irvine.oeis.a112;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A112216.
 * @author Sean A. Irvine
 */
public class A112216 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.pow(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(46, mN), mN), 2, mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(4, mN), mN), eta.substitutePower(23, mN), mN), eta.substitutePower(92, mN), mN);
    return RING.coeff(a, b, mN);
  }
}
