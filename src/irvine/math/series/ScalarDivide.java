package irvine.math.series;

import irvine.math.api.Field;

/**
 * Divide a power series by a constant.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class ScalarDivide<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final E mN;

  ScalarDivide(final Field<E> elementField, final Series<E> s, final E n) {
    mElementField = elementField;
    mS = s;
    mN = n;
  }

  @Override
  public E coeff(final int n) {
    if (n > mS.bound()) {
      return mElementField.zero();
    }
    return mElementField.divide(mS.coeff(n), mN);
  }

  @Override
  public int bound() {
    return mS.bound();
  }
}
