package irvine.oeis.a339;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A339231 Triangle read by rows: T(n,k) is the number of oriented series-parallel networks whose multigraph has n edges and k interior vertices, 0 &lt;= k &lt; n.
 * @author Gregory Morse
 */
public class A339231 extends Sequence1 {
  // After Andrew Howroyd.
  private static final PolynomialRingField<Q> Y = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(Y);
  private final boolean mEdgeWeights;
  private final boolean mUnoriented;
  private final Polynomial<Polynomial<Q>> mWeight;
  private final Polynomial<Polynomial<Q>> mOriented = RING.empty();
  private final Polynomial<Polynomial<Q>> mParallel = RING.empty();
  private final Polynomial<Polynomial<Q>> mResults = RING.empty();
  private int mN = 0;
  private int mK = 0;

  protected A339231(final boolean edgeWeights, final boolean unoriented) {
    mEdgeWeights = edgeWeights;
    mUnoriented = unoriented;
    mWeight = RING.monomial(edgeWeights ? Y.one() : Y.x(), 0);
    mOriented.add(Y.zero());
    mParallel.add(Y.zero());
    mResults.add(Y.zero());
  }

  /** Construct the sequence. */
  public A339231() {
    this(false, false);
  }

  private static Polynomial<Polynomial<Q>> doubled(final Polynomial<Polynomial<Q>> p) {
    return PolynomialUtils.deepSubstitute(RING, p, 2);
  }

  private static Polynomial<Q> euler(final Polynomial<Polynomial<Q>> p, final int n) {
    final Polynomial<Polynomial<Q>> a = RING.empty();
    for (int k = 0; k <= n; ++k) {
      a.add(p.coeff(k));
    }
    return PolynomialUtils.eulerTransform(Y, a).coeff(n);
  }

  private Polynomial<Polynomial<Q>> elements(final int n) {
    if (!mEdgeWeights) {
      return RING.x();
    }
    final Polynomial<Polynomial<Q>> res = RING.empty();
    res.add(Y.zero());
    for (int k = 1; k <= n; ++k) {
      res.add(Y.one());
    }
    return res;
  }

  private static Polynomial<Polynomial<Q>> series(final Polynomial<Polynomial<Q>> b, final Polynomial<Polynomial<Q>> w, final int n) {
    final Polynomial<Polynomial<Q>> wb = RING.multiply(w, b, n);
    return RING.series(RING.multiply(wb, b, n), RING.add(RING.one(), wb), n);
  }

  private Polynomial<Q> advance(final int n) {
    final Polynomial<Polynomial<Q>> z = elements(n);
    final Polynomial<Q> oriented = euler(RING.add(z, series(mOriented, mWeight, n)), n);
    mOriented.add(oriented);
    if (!mUnoriented) {
      return oriented;
    }
    final Polynomial<Polynomial<Q>> paired = doubled(mOriented.truncate(n / 2));
    final Polynomial<Polynomial<Q>> t = RING.add(z, RING.multiply(RING.multiply(mWeight, paired, n),
      RING.add(RING.one(), RING.multiply(mWeight, mParallel, n)), n));
    final Polynomial<Polynomial<Q>> s = RING.add(doubled(z), series(paired, doubled(mWeight), n));
    final Polynomial<Polynomial<Q>> types = RING.add(t, RING.divide(RING.subtract(s, doubled(t)), Y.monomial(Q.TWO, 0)));
    final Polynomial<Q> parallel = Y.add(z.coeff(n), Y.subtract(euler(types, n), t.coeff(n)));
    mParallel.add(parallel);
    return Y.divide(Y.add(oriented, Y.subtract(Y.add(parallel, t.coeff(n)), z.coeff(n))), Q.TWO);
  }

  protected final Polynomial<Q> counts(final int n) {
    while (mResults.degree() < n) {
      mResults.add(advance(mResults.degree() + 1));
    }
    return mResults.coeff(n);
  }

  @Override
  public Z next() {
    if (++mK >= mN) {
      ++mN;
      mK = 0;
    }
    return counts(mN).coeff(mK).toZ();
  }
}
