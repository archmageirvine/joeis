package irvine.math.series;

import java.util.HashMap;

/**
 * Cache the coefficients of a series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class CachedSeries<E> implements Series<E> {

  private final Series<E> mSeries;
  private final E mZero;
  private final HashMap<Integer, E> mCache = new HashMap<>();

  CachedSeries(final Series<E> s, final E zero) {
    mSeries = s;
    mZero = zero;
  }

  @Override
  public E coeff(final int n) {
    return n <= bound() ? mCache.computeIfAbsent(n, mSeries::coeff) : mZero;
  }

  @Override
  public int bound() {
    return mSeries.bound();
  }
}
