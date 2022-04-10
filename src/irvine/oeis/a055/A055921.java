package irvine.oeis.a055;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055921 Array giving susceptibility of 2-dimensional Ising model for 1 particle excitation (read by antidiagonals).
 * @author Sean A. Irvine
 */
public class A055921 implements Sequence {

  /* A(x, y)=(1-x^2)*(1-y^2)/(1-x-y-xy)^2 * (1 - 16*x^2*y^2/((1-x^2)^2*(1-y^2)^2))^(1/4) */

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(RING_Y);
  private static final Polynomial<Polynomial<Q>> C1 = RING.monomial(RING_Y.monomial(new Q(16), 2), 2);
  private static final Polynomial<Polynomial<Q>> C2 = RING.pow(RING.create(Arrays.asList(RING_Y.oneMinusXToTheN(1), RING_Y.negate(RING_Y.onePlusXToTheN(1)))), 2);
  private Polynomial<Polynomial<Q>> mGf;
  private int mN = -1;
  private int mM = 0;

  private Polynomial<Polynomial<Q>> gf(final int n) {
    final Polynomial<Polynomial<Q>> ax2 = RING.oneMinusXToTheN(2);
    final Polynomial<Q> ay2 = RING_Y.oneMinusXToTheN(2);
    final Polynomial<Polynomial<Q>> a = RING.multiply(ax2, ay2);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>(Rationals.SINGLETON, n));
    final Polynomial<Polynomial<Q>> b = ring.series(C1, RING.multiply(a, a, n), n);
    final Polynomial<Polynomial<Q>> s = ring.sqrt(ring.sqrt1m(b, n), n);
    final Polynomial<Polynomial<Q>> c = RING.multiply(a, s, n);
    return ring.series(c, C2, n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mGf = gf(mN);
    }
    return mGf.coeff(mM).coeff(mN - mM).toZ();
  }
}
