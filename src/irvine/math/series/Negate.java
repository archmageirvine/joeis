package irvine.math.series;

import irvine.math.api.Field;

/**
 * Negate a power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Negate<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;

  Negate(final Field<E> elementField, final Series<E> s) {
    mElementField = elementField;
    mS = s;
  }

  @Override
  public E coeff(final int n) {
    return mElementField.negate(mS.coeff(n));
  }

  @Override
  public int bound() {
    return mS.bound();
  }
}
