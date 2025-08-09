package irvine.math.series;

import irvine.math.api.Field;

/**
 * Subtract power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Subtract<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final Series<E> mT;
  private final int mBound;

  Subtract(final Field<E> elementField, final Series<E> s, final Series<E> t) {
    mElementField = elementField;
    mS = s;
    mT = t;
    mBound = Math.max(mS.bound(), mT.bound()); // Remember this is only an upper bound
  }

  @Override
  public E coeff(final int n) {
    return mElementField.subtract(mS.coeff(n), mT.coeff(n));
  }

  @Override
  public int bound() {
    return mBound;
  }
}
