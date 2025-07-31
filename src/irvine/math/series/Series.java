package irvine.math.series;

/**
 * General interface for representing a series.
 * A series is able to produce coefficients on demand.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public interface Series<E> {

  /**
   * Return a coefficient of the series.
   * @param n coefficient number
   * @return the coefficient
   */
  E coeff(final int n);
}
