package irvine.math.series;

import java.util.List;

/**
 * Construct a finite series backed by a list.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class FiniteSeries<E> implements Series<E> {

  private final E mZero;
  private final List<E> mCoeffs;

  /**
   * Construct a finite series.
   * @param zero underlying zero.
   */
  FiniteSeries(final E zero, final List<E> coeffs) {
    mZero = zero;
    mCoeffs = coeffs;
  }

  @Override
  public E coeff(final int n) {
    return n < 0 || n >= mCoeffs.size() ? mZero : mCoeffs.get(n);
  }
}
