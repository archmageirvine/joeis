package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058091 McKay-Thompson series of class 9B for the Monster group.
 * @author Sean A. Irvine
 */
public class A058091 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = RING.monomial(Z.FOUR, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> a = RING.series(eta, eta.substitutePower(2, mN), mN);
    final Polynomial<Z> b = RING.series(RING.pow(a.substitutePower(3, mN), 3, mN), a, mN);
    return b.coeff(mN).add(RING.coeff(C1, RING.pow(b, 2, mN), mN));
  }
}
