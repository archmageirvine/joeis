package irvine.oeis.a057;

import java.util.function.Function;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057271.
 * @author Sean A. Irvine
 */
public class A057273 implements Sequence {

  // After Andrew Howroyd

  protected static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(RING_Y);

  private int mN = 0;
  private int mM = 0;
  private Z mF = Z.ONE;
  private Polynomial<Q> mRow = null;

  private Polynomial<Polynomial<Q>> z(final Polynomial<Polynomial<Q>> p, final Function<Integer, Polynomial<Q>> f) {
    final int n = p.degree();
    final Polynomial<Polynomial<Q>> sum = RING.empty();
    for (int k = 0; k <= n; ++k) {
      sum.add(f.apply(k));
    }
    return RING.hadamardMultiply(p, sum);
  }

  protected Polynomial<Polynomial<Q>> g(final Polynomial<Q> e, final Polynomial<Polynomial<Q>> p, final int m) {
    return z(p, k -> RING_Y.series(RING_Y.one(), RING_Y.pow(e, k * (k - 1) / 2, m), m));
  }

  protected Polynomial<Polynomial<Q>> u(final Polynomial<Q> e, final Polynomial<Polynomial<Q>> p, final int m) {
    return z(p, k -> RING_Y.pow(e, k * (k - 1) / 2, m));
  }

  protected Polynomial<Polynomial<Q>> digraphEgf(final int n, final int m, final Polynomial<Q> e) {
    final Polynomial<Polynomial<Q>> sum = RING.empty();
    Q kf = Q.ONE;
    for (int k = 0; k <= n; ++k) {
      if (k > 1) {
        kf = kf.multiply(k);
      }
      sum.add(RING_Y.divide(RING_Y.pow(e, k * (k - 1), m), kf));
    }
    return sum;
  }

  protected Polynomial<Polynomial<Q>> strongD(final int n, final int m, final Polynomial<Q> e) {
    // Take care here to ensure expansions in y are limited to degree m
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    return ring.negate(ring.log(u(e, ring.series(ring.one(), g(e, digraphEgf(n, m, e), m), n), m), n));
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      mF = mF.multiply(++mN);
      mM = 0;
      mRow = strongD(mN, mN * (mN - 1), RING_Y.onePlusXToTheN(1)).coeff(mN);
    }
    return mRow.coeff(mM).multiply(mF).toZ();
  }
}
