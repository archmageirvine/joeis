package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A002830 Number of 3-edge-colored trivalent graphs with <code>2n</code> nodes.
 * @author Sean A. Irvine
 */
public class A002830 extends A002831 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mGF = RING.zero();
  private int mN = 0;

  @Override
  public Z next() {
    mGF = RING.add(mGF, RING.monomial(new Q(super.next()), ++mN));
    Polynomial<Q> sum = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      sum = RING.add(sum, RING.divide(mGF.substitutePower(k, mN), new Q(k)));
    }
    return RING.exp(sum, mN).coeff(mN).toZ();
  }
}
