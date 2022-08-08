package irvine.oeis.a058;

import irvine.math.LongUtils;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058519 Number of directed cycles of B-trees of order 3 with n labeled leaves.
 * @author Sean A. Irvine
 */
public class A058519 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> M = Polynomial.create(Q.ZERO, Q.ZERO, Q.ONE, Q.ONE);
  private int mN = -1;
  private Polynomial<Q> mB = RING.x();

  @Override
  public Z next() {
    ++mN;
    mB = RING.add(RING.x(), RING.substitute(mB, M, mN));
    final Polynomial<Q> c = RING.sum(1, mN, k -> RING.multiply(RING.log1p(RING.negate(mB.substitutePower(k, mN)), mN), new Q(-LongUtils.phi(k), k)));
    return c.coeff(mN).toZ();
  }
}
