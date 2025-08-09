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
  public E coeff(final int n) {
    return mElementField.multiply(mS.coeff(n + 1), mElementField.coerce(n + 1));
  }

  @Override
  public int bound() {
    return mS.bound() - 1;
  }
}
