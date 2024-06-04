package irvine.math.polynomial;

import java.util.HashMap;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;

/**
 * Common implementation of functions supporting a series.
 * @author Sean A. Irvine
 */
public abstract class AbstractSeries2 implements Series2 {

  /** Convenient ring needed for many such computations.*/
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final HashMap<Long, Polynomial<Q>> mCache = new HashMap<>();

  /**
   * Carry out the computation of a specific series.
   * The <code>current</code> parameter is the current polynomial available for the
   * function (can be <code>null</code> if none is available). Implementations are
   * free to ignore this parameter if they do not support incremental expansion.
   * Implementations may incrementally extend the given polynomial or create a new one.
   * @param current the current polynomial
   * @param v function index
   * @param minDegree degree to which the expansion is to be extended to.
   * @return the polynomial series
   */
  protected abstract Polynomial<Q> compute(final Polynomial<Q> current, final long v, final int minDegree);

  @Override
  public Polynomial<Q> s(final long v, final int minDegree) {
    final Polynomial<Q> p = mCache.get(v);
    if (p != null && p.degree() >= minDegree) {
      return p;
    }
    final Polynomial<Q> q = compute(p == null ? RING.empty() : p, v, minDegree);
    mCache.put(v, q);
    return q;
  }

  @Override
  public Polynomial<Q> s(final long v, final int minDegree, final Polynomial<Q> z) {
    return RING.substitute(s(v, minDegree), z, minDegree);
  }

  @Override
  public Q c(final long v, final int n) {
    return s(v, n).coeff(n);
  }
}
