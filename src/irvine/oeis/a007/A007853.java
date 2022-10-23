package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007853 Number of maximal antichains in rooted plane trees on n nodes.
 * @author Sean A. Irvine
 */
public class A007853 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X4 = RING.monomial(Q.FOUR, 1);
  private static final Polynomial<Q> X2 = RING.create(Arrays.asList(Q.ONE, Q.TWO));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.THREE, new Q(-2)));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ONE, new Q(-8), Q.TWO));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> s = RING.sqrt1m(X4, mN);
    final Polynomial<Q> t = RING.sqrt(RING.divide(RING.add(RING.multiply(s, X2, mN), C), Q.TWO), mN);
    final Polynomial<Q> gf = RING.subtract(RING.subtract(B, s), RING.multiply(t, Q.TWO));
    return gf.coeff(mN).toZ().divide(4);
  }
}
