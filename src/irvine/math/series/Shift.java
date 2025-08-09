package irvine.math.series;

import irvine.math.api.Field;

/**
 * Shift a power series by a specified degree.
 * Positive values increase degree, negative values decrease degree
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Shift<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final int mShift;
  private final int mBound;

  Shift(final Field<E> elementField, final Series<E> s, final int shift) {
    mElementField = elementField;
    mS = s;
    mShift = shift;
    mBound = s.bound() == Integer.MAX_VALUE ? Integer.MAX_VALUE : s.bound() + shift;
  }

  @Override
  public E coeff(final int n) {
    // Note: avoids requesting negative powers from the underlying series.
    // In some cases, it would be possible to make that work, but overall it is
    // better to avoid triggering calculations of negative powers in s.
    return n - mShift >= 0 ? mS.coeff(n - mShift) : mElementField.zero();
  }

  @Override
  public int bound() {
    return mBound;
  }
}
