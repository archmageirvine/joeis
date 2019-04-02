package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002214 Number of unrooted hexagonal polyominoes with n cells and no reflections allowed.
 * @author Sean A. Irvine
 */
public class A002214 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO_X = RING.create(Arrays.asList(Q.ZERO, Q.TWO));
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ONE, new Q(-3)));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.ZERO, new Q(-6), new Q(5)));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.NEG_ONE, Q.THREE));
  private static final Polynomial<Q> D = RING.onePlusXToTheN(1);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> s = RING.subtract(A, RING.sqrt1p(B, mN));
    final Polynomial<Q> u = RING.series(s, TWO_X, mN);
    final Polynomial<Q> s1 = RING.add(RING.x(), RING.multiply(u, RING.x()));
    final Polynomial<Q> us = RING.multiply(RING.pow(u, 2, mN), C);
    final Polynomial<Q> u2 = RING.multiply(u.substitutePower(2, mN), D, mN);
    final Polynomial<Q> s2 = RING.divide(RING.add(us, u2), Q.TWO);
    final Polynomial<Q> uc = RING.pow(u, 3, mN);
    final Polynomial<Q> u3 = RING.multiply(u.substitutePower(3, mN), Q.TWO);
    final Polynomial<Q> s3 = RING.divide(RING.multiply(RING.add(uc, u3), RING.x(), mN), Q.THREE);
    final Polynomial<Q> gf = RING.add(RING.add(s1, s2), s3);
    return gf.coeff(mN).toZ();
  }
}
