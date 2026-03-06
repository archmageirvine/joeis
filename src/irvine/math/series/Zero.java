package irvine.math.series;

/**
 * Constant zero series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Zero<E> implements Series<E> {

  private final E mZero;

  Zero(final E zero) {
    mZero = zero;
  }

  @Override
  public E coeff(final long n) {
    return mZero;
  }

  @Override
  public long bound() {
    return 0;
  }
}
