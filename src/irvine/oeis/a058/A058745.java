package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058745 McKay-Thompson series of class 70B for Monster.
 * @author Sean A. Irvine
 */
public class A058745 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(10, mN), mN), eta.substitutePower(14, mN), mN), eta.substitutePower(35, mN), mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(5, mN), mN), eta.substitutePower(7, mN), mN), eta.substitutePower(70, mN), mN);
    return RING.coeff(a, b, mN);
  }
}
