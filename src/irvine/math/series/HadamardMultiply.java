package irvine.math.series;

import irvine.math.api.Field;

/**
 * Hadamard multiply of power series.
 * Term-by-term multiply.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class HadamardMultiply<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final Series<E> mT;
  private final int mBound;

  HadamardMultiply(final Field<E> elementField, final Series<E> s, final Series<E> t) {
    mElementField = elementField;
    mS = s;
    mT = t;
    mBound = Math.min(mS.bound(), mT.bound());
  }

  @Override
  public E coeff(final int n) {
    if (n > mBound) {
      return mElementField.zero();
    }
    return mElementField.multiply(mS.coeff(n), mT.coeff(n));
  }

  @Override
  public int bound() {
    return mBound;
  }
}
