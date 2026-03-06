package irvine.math.series;

import irvine.math.api.Field;

/**
 * Form the derivative power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Derivative<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;

  Derivative(final Field<E> elementField, final Series<E> s) {
    mElementField = elementField;
    mS = s;
  }

  @Override
  public E coeff(final long n) {
    return mElementField.multiply(mS.coeff(n + 1), mElementField.coerce(n + 1));
  }

  @Override
  public long bound() {
    return mS.bound() == Long.MAX_VALUE ? Long.MAX_VALUE : mS.bound() - 1;
  }
}
