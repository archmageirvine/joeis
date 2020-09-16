package irvine.oeis.a112;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A112211 McKay-Thompson series of class 84B for the Monster group.
 * @author Sean A. Irvine
 */
public class A112211 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Polynomial<Z> eta = RING.eta(RING.x(), ++mN);
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.multiply(eta, eta.substitutePower(6, mN), mN), eta.substitutePower(14, mN), mN), eta.substitutePower(21, mN), mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.multiply(eta.substitutePower(2, mN), eta.substitutePower(3, mN), mN), eta.substitutePower(7, mN), mN), eta.substitutePower(42, mN), mN);
    return RING.coeff(a, b, mN);
  }
}
