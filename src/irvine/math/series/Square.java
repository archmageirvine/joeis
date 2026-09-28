package irvine.math.series;

import irvine.math.api.Field;
import irvine.math.z.Z;

/**
 * Square of a power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Square<E> implements Series<E> {

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final long mBound;
  private final E mTwo;

  Square(final Field<E> elementField, final Series<E> s) {
    mElementField = elementField;
    mS = s;
    final Z b = Z.valueOf(mS.bound()).multiply2();
    mBound = b.bitLength() < Long.SIZE ? b.longValue() : Long.MAX_VALUE;
    mTwo = mElementField.coerce(2);
  }

  @Override
  public E coeff(final long n) {
    if (n > mBound) {
      return mElementField.zero();
    }
    final long lo = Math.max(0, n - mS.bound());
    final long hi = Math.min(n, mS.bound());
    return mElementField.sum(lo, hi, k -> mElementField.multiply(mS.coeff(k), mS.coeff(n - k)));
    // todo why does the following not work?
//    E sum = mElementField.multiply(mElementField.sum(0, (n - 1) / 2, k -> mElementField.multiply(mS.coeff(k), mS.coeff(n - k))), mTwo);
//    if ((n & 1) == 0) {
//      final E c = mS.coeff(n / 2);
//      sum = mElementField.add(sum, mElementField.multiply(c, c));
//    }
//    return sum;
  }

  @Override
  public long bound() {
    return mBound;
  }
}
