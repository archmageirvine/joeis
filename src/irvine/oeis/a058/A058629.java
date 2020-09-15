package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058629 McKay-Thompson series of class 32A for Monster.
 * @author Sean A. Irvine
 */
public class A058629 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.pow(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(16, mN), mN), 3, mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(RING.pow(eta, 2, mN), eta.substitutePower(4, mN), mN), eta.substitutePower(8, mN), mN), RING.pow(eta.substitutePower(32, mN), 2, mN), mN);
    return RING.coeff(a, b, mN);
  }
}
