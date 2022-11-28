package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060514 Triangle T(n,k) of series-reduced (or homeomorphically irreducible) labeled graphs with n nodes and k edges, k=0..binomial(n,2).
 * @author Sean A. Irvine
 */
public class A060514 extends Sequence0 {

  private static final PolynomialRingField<Q> INNER = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(INNER);
  private static final Polynomial<Polynomial<Q>> NY2X = RING.monomial(INNER.monomial(Q.NEG_ONE, 2), 1);
  private static final Polynomial<Polynomial<Q>> OPYX = RING.onePlusXToTheN(INNER.x(), 1); // 1 + x * y
  private static final Polynomial<Polynomial<Q>> HY3X2 = RING.monomial(INNER.monomial(Q.HALF, 3), 2); // (1/2)*y^3*x^2
  private static final Polynomial<Q> Y1 = INNER.onePlusXToTheN(1);
  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private Polynomial<Polynomial<Q>> mEgf = RING.one();
  private int mN = 0;
  private int mM = -1;

  private Polynomial<Polynomial<Q>> t(final int n) {
    final int m = n * (n - 1) / 2;
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Polynomial<Q>> sqrt = ring.series(ring.one(), ring.sqrt1p(ring.monomial(inner.x(), 1), n), n);
    final Polynomial<Polynomial<Q>> exp = ring.exp(ring.create(Arrays.asList(inner.zero(), inner.monomial(Q.HALF, 1), inner.monomial(Q.ONE_QUARTER.negate(), 2))), n);
    final Polynomial<Polynomial<Q>> se = ring.multiply(sqrt, exp, n);
    // sum((1/k!)*((1+y)*exp(-y^2*x/(1+y*x)))^binomial(k, 2)*(x*exp((1/2)*y^3*x^2/(1+y*x)))^k,k=0..n)
    final Polynomial<Polynomial<Q>> t = ring.multiply(ring.exp(ring.series(NY2X, OPYX, n), n), Y1);
    Polynomial<Polynomial<Q>> sum = ring.zero();
    for (int k = 0; k <= n; ++k) {
      final Q invkf = new Q(Z.ONE, F.factorial(k)); // 1/k!
      final Polynomial<Polynomial<Q>> a = ring.pow(t, k * (k - 1) / 2, n);
      final Polynomial<Polynomial<Q>> b = ring.exp(ring.series(HY3X2, OPYX, n), n).shift(1);
      final Polynomial<Polynomial<Q>> c = ring.multiply(ring.pow(b, k, n), inner.monomial(invkf, 0));
      sum = ring.add(sum, ring.multiply(a, c, n));
    }
    return ring.multiply(se, sum, n);
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
      mEgf = t(mN);
    }
    return mEgf.coeff(mN).coeff(mM).multiply(F.factorial(mN)).toZ();
  }
}
