package irvine.math.series;

import irvine.math.api.Field;

/**
 * Form the integral power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Integral<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final long mBound;
  private final E mConstant;

  Integral(final Field<E> elementField, final Series<E> s, final E constant) {
    mElementField = elementField;
    mS = s;
    mConstant = constant;
    mBound = mS.bound() == Long.MAX_VALUE ? Long.MAX_VALUE : mS.bound() + 1;
  }

  @Override
  public E coeff(final long n) {
    return n == 0 ? mConstant : mElementField.divide(mS.coeff(n - 1), mElementField.coerce(n));
  }

  @Override
  public long bound() {
    return mBound;
  }
}
