package irvine.oeis.a100;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A100960.
 * @author Sean A. Irvine
 */
public class A100960 extends Sequence3 {

  private Polynomial<Polynomial<Q>> mGf = null;
  private int mN = 2;
  private int mM = 0;

  // c-nets with n edges and k vertices
  protected Z q(final int n, final int k) {
    if (k < 2 + (n + 2) / 3 || k > 2 * n / 3) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sum(2, k,
      i -> Integers.SINGLETON.sum(k, n,
        j -> Z.NEG_ONE.pow(i + j + 1 - k)
          .multiply(Binomial.binomial(i + j - k, i))
          .multiply(i).multiply(i - 1).divide2()
          .multiply(Binomial.binomial(2L * n - 2L * k + 2, k - i).multiply(Binomial.binomial(2L * k - 2, n - j)).subtract(Binomial.binomial(2L * n - 2 * k + 1, k - i - 1).multiply(Binomial.binomial(2 * k - 3, n - j - 1).multiply(4))))
      )
    );
  }

  protected Polynomial<Polynomial<Q>> series(final int n) {
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("t", Rationals.SINGLETON, n);
    final int maxDegree = 3 * n;
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Polynomial<Q>> q = ring.empty();
    q.add(inner.zero()); // * x
    for (int j = 1; j <= 3 * n + 1; ++j) {
      final Q[] t = new Q[Math.min(n + 3, 2 * j / 3)];
      for (int k = 0; k < t.length; ++k) {
        t[k] = new Q(q(j, k + 1));
      }
      final Polynomial<Q> pt = Polynomial.create(t).shift(1); // * t
      q.add(pt);
    }
    final Polynomial<Polynomial<Q>> exp = ring.exp(ring.add(ring.series(q, ring.monomial(inner.monomial(Q.TWO, 2), 1), maxDegree),
      ring.series(ring.monomial(inner.x(), 2), ring.onePlusXToTheN(inner.x(), 1), maxDegree)),
      maxDegree);
    final Polynomial<Polynomial<Q>> d = ring.reversion(ring.subtract(ring.series(ring.onePlusXToTheN(1), exp, maxDegree), ring.one()), maxDegree);
    final Polynomial<Polynomial<Q>> g2 = ring.integrate(ring.multiply(ring.subtract(ring.series(ring.add(ring.one(), d), ring.onePlusXToTheN(1), maxDegree), ring.one()), inner.monomial(Q.HALF, 2)));
    final PolynomialRingField<Polynomial<Q>> ring2 = new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>("t", Rationals.SINGLETON, maxDegree));
    return ring2.serlaplace(PolynomialUtils.swapVariables(inner, g2));
  }

  @Override
  public Z next() {
    if (++mM > 3 * (mN - 2)) {
      mM = ++mN;
      mGf = series(mN + 2);
    }
    return mGf.coeff(mN).coeff(mM).toZ();
  }
}
