package irvine.math.series;

import irvine.math.api.Field;

/**
 * Truncate a power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Truncate<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final long mN;

  Truncate(final Field<E> elementField, final Series<E> s, final long n) {
    mElementField = elementField;
    mS = s;
    mN = n;
  }

  @Override
  public E coeff(final long n) {
    return n > mN ? mElementField.zero() : mS.coeff(n);
  }

  @Override
  public long bound() {
    return mN;
  }
}
