package irvine.oeis.a064;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064521 Number of rooted 5-connected planar triangulations with 2n faces.
 * @author Sean A. Irvine
 */
public class A064521 extends AbstractSequence {

  // After Ian Wanless

  private static final Polynomial<Q> S1 = Polynomial.create(Q.ONE, Q.ONE);
  private static final Polynomial<Q> TWO = Polynomial.create(Q.TWO);
  private static final Polynomial<Q> EIGHT = Polynomial.create(Q.EIGHT);
  private static final Polynomial<Q> NEG_ONE = Polynomial.create(Q.NEG_ONE);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ZERO, Q.TWO, Q.ONE);
  private static final Polynomial<Q> C2 = Polynomial.create(Q.NEG_ONE, Q.THREE);
  private static final Polynomial<Q> C3 = Polynomial.create(Q.TWO, Q.THREE, Q.ZERO, Q.NEG_ONE);
  private static final Polynomial<Q> C4 = Polynomial.create(Q.TWO, Q.FOUR, Q.EIGHT);
  private int mN = 9;

  /** Construct the sequence. */
  public A064521() {
    super(10);
  }

  @Override
  public Z next() {
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("s", Rationals.SINGLETON, ++mN);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("w", inner);

    // T := -3*w^3/(1 + w) + w - w^2 + 3*w^3 - w^4 + 4*(s + 1)^3* ((3*s - 1)*w + (3*s - 2)*(s + 1)^3)*w / (3*s + 2 + w - s^3)^3;
    final Polynomial<Polynomial<Q>> a = ring.multiply(ring.series(ring.one(), ring.onePlusXToTheN(1), mN).shift(3), inner.monomial(new Q(-3), 0));
    final Polynomial<Polynomial<Q>> b = ring.subtract(ring.add(ring.subtract(ring.add(a, ring.x()), ring.x().shift(1)), ring.multiply(ring.x().shift(3), inner.monomial(Q.THREE, 0))), ring.x().shift(4));
    final Polynomial<Q> c = inner.multiply(Polynomial.create(new Q(-2), Q.THREE), inner.pow(S1, 3));
    final Polynomial<Polynomial<Q>> d = ring.add(ring.monomial(C2, 1), ring.monomial(c, 0)).shift(1);
    final Polynomial<Polynomial<Q>> e = ring.multiply(d, inner.multiply(inner.pow(S1, 3), Q.FOUR));
    final Polynomial<Polynomial<Q>> f = ring.pow(ring.create(Arrays.asList(C3, inner.one())), 3, mN);
    final Polynomial<Polynomial<Q>> t = ring.add(b, ring.series(e, f, mN));

    // iteration := s - (-w^2 + 2*(4*s^2 + 2*s + 1)*(s + 1)^2*w + s*(s + 2)*(s + 1)^4)/(8*w + 2);
    final Polynomial<Polynomial<Q>> s = ring.monomial(inner.x(), 0);
    final Polynomial<Q> g = inner.multiply(C4, inner.pow(S1, 2, mN));
    final Polynomial<Polynomial<Q>> h = ring.create(Arrays.asList(inner.multiply(C1, inner.pow(S1, 4, mN), mN), g, NEG_ONE));
    final Polynomial<Polynomial<Q>> i = ring.series(h, ring.create(Arrays.asList(TWO, EIGHT)), mN);
    final Polynomial<Polynomial<Q>> iteration = ring.subtract(s, i);

    Polynomial<Q> sval = inner.zero();
    Polynomial<Q> previous = Polynomial.create(Q.NEG_ONE);
    while (!sval.equals(previous)) {
      previous = sval;
      sval = PolynomialUtils.innerSubstitute(inner, iteration, sval, mN);
    }

    return PolynomialUtils.innerSubstitute(inner, t, sval, mN).coeff(mN).toZ();
  }
}

