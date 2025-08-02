package irvine.math.series;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * General interface for representing a series.
 * A series is able to produce coefficients on demand.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public interface Series<E> {

  /**
   * Create a finite integer series from a list of coefficients.
   * @param coeffs coefficients
   * @return series
   */
  static Series<Z> create(final long... coeffs) {
    return n -> n < coeffs.length ? Z.valueOf(coeffs[n]) : Z.ZERO;
  }

  /**
   * Create a finite integer series from a list of coefficients.
   * @param coeffs coefficients
   * @return series
   */
  static Series<Z> create(final Z... coeffs) {
    return n -> n < coeffs.length ? coeffs[n] : Z.ZERO;
  }

  /**
   * Convert an integer series to a rational series.
   * @param series integer series
   * @return rational series
   */
  static Series<Q> toQ(final Series<Z> series) {
    return n -> Q.valueOf(series.coeff(n));
  }

  /**
   * Return a coefficient of the series.
   * @param n coefficient number
   * @return the coefficient
   */
  E coeff(final int n);
}
