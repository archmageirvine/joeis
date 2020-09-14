package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052241 McKay-Thompson series of class 8C for Monster.
 * @author Sean A. Irvine
 */
public class A052241 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.monomial(new Q(64), 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> eta = RING.eta(RING.x(), mN);
    final Polynomial<Q> a = RING.pow(RING.series(eta, eta.substitutePower(2, mN), mN), 12, mN);
    return RING.sqrt(RING.add(a, RING.series(C1, a, mN)), mN).coeff(mN).toZ();
  }
}
