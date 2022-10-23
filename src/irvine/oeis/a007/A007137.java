package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007137 Number of rooted maps with n edges on the projective plane.
 * @author Sean A. Irvine
 */
public class A007137 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWELVE = RING.monomial(new Q(12), 1);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> r = RING.sqrt1m(TWELVE, mN);
    final Polynomial<Q> a = RING.multiply(RING.add(RING.multiply(r, Q.TWO), RING.one()), Q.ONE_THIRD);
    final Polynomial<Q> b = RING.sqrt(RING.multiply(RING.multiply(r, RING.add(r, TWO), mN), Q.ONE_THIRD), mN);
    return RING.subtract(a, b).coeff(mN).toZ().divide2();
  }
}
