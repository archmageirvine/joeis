package irvine.math.polynomial;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;

/**
 * Common implementation of functions supporting a series.
 * @author Sean A. Irvine
 */
public abstract class AbstractSeries1 implements Series1 {

  /** Convenient ring needed for many such computations.*/
  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> mPoly = RING.empty();

  /**
   * Carry out the computation of a specific series.
   * The <code>current</code> parameter is the current polynomial available for the
   * function. Implementations are free to ignore this parameter if they do not support
   * incremental expansion.
   * @param current the current polynomial
   * @param minDegree degree to which the expansion is to be extended to.
   * @return the polynomial series
   */
  protected abstract Polynomial<Q> compute(final Polynomial<Q> current, final int minDegree);

  @Override
  public Polynomial<Q> s(final int minDegree) {
    if (mPoly.degree() < minDegree) {
      mPoly = compute(mPoly, minDegree);
    }
    return mPoly;
  }

  @Override
  public Polynomial<Q> s(final int minDegree, final Polynomial<Q> z) {
    return RING.substitute(s(minDegree), z, minDegree);
  }

  @Override
  public Q c(final int n) {
    return s(n).coeff(n);
  }
}
