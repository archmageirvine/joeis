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
  private final int mN;

  Truncate(final Field<E> elementField, final Series<E> s, final int n) {
    mElementField = elementField;
    mS = s;
    mN = n;
  }

  @Override
  public E coeff(final int n) {
    return n > mN ? mElementField.zero() : mS.coeff(n);
  }

  @Override
  public int bound() {
    return mN;
  }
}
