package irvine.math.series;

import irvine.math.api.Field;

/**
 * Form the derivative power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Integral<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final int mBound;

  Integral(final Field<E> elementField, final Series<E> s) {
    mElementField = elementField;
    mS = s;
    mBound = mS.bound() == Integer.MAX_VALUE ? Integer.MAX_VALUE : mS.bound() + 1;
  }

  @Override
  public E coeff(final int n) {
    return n == 0 ? mElementField.zero() : mElementField.divide(mS.coeff(n - 1), mElementField.coerce(n));
  }

  @Override
  public int bound() {
    return mBound;
  }
}
