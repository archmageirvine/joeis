package irvine.math.series;

import irvine.math.api.Field;

/**
 * Add power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Add<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final Series<E> mT;
  private final int mBound;

  Add(final Field<E> elementField, final Series<E> s, final Series<E> t) {
    mElementField = elementField;
    mS = s;
    mT = t;
    mBound = Math.max(mS.bound(), mT.bound());
  }

  @Override
  public E coeff(final int n) {
    return mElementField.add(mS.coeff(n), mT.coeff(n));
  }

  @Override
  public int bound() {
    return mBound;
  }
}
