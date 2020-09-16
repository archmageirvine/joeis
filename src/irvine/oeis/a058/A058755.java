package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058755.
 * @author Sean A. Irvine
 */
public class A058755 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(6, mN), mN), eta.substitutePower(26, mN), mN), eta.substitutePower(39, mN), mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(3, mN), mN), eta.substitutePower(13, mN), mN), eta.substitutePower(78, mN), mN);
    return RING.coeff(a, b, mN);
  }
}
