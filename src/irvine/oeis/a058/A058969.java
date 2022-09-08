package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058969 Numerators of expansion of a function eta(x) related to Cremer points.
 * @author Sean A. Irvine
 */
public class A058969 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  private Polynomial<Q> eta(final int n) {
    // Redo whole calculation to necessary precision
    Polynomial<Q> eta = Polynomial.create(Q.ZERO, Q.ONE_QUARTER.negate());
    for (int k = 2; k <= n; ++k) {
      eta = RING.add(eta, RING.pow(eta, 2, n).shift(k - 2));
    }
    return eta;
  }

  @Override
  public Z next() {
    return select(eta(++mN).coeff(mN));
  }
}
