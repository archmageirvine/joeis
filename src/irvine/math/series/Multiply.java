package irvine.math.series;

import irvine.math.api.Field;
import irvine.math.z.Z;

/**
 * Multiply power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Multiply<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final Series<E> mT;
  private final int mBound;

  Multiply(final Field<E> elementField, final Series<E> s, final Series<E> t) {
    mElementField = elementField;
    mS = s;
    mT = t;
    final Z b = Z.valueOf(mS.bound()).add(mT.bound());
    mBound = b.bitLength() < Integer.SIZE ? b.intValue() : Integer.MAX_VALUE;
  }

  @Override
  public E coeff(final int n) {
    if (n > mBound) {
      return mElementField.zero();
    }
    final int lo = Math.max(0, n - mT.bound());
    final int hi = Math.min(n, mS.bound());
    return mElementField.sum(lo, hi, k -> mElementField.multiply(mS.coeff(k), mT.coeff(n - k)));
  }

  @Override
  public int bound() {
    return mBound;
  }
}
