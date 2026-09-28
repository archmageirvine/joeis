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
    // Sum_{k=0..n} ([x^k] S(x)) * ([x^[n-k] S(x)) = 2 * Sum_{k=0..n/2}  ([x^k] S(x)) * ([x^[n-k] S(x)) + [n even] * ([x^{n/2}] S(x))^2
    // Some care needed to handle lo and hi efficiently
    E sum = mElementField.zero();
    for (long k = Math.max(lo, n - hi), j = n - lo; k < j; ++k, --j) {
      sum = mElementField.add(sum, mElementField.multiply(mS.coeff(k), mS.coeff(j)));
    }
    sum = mElementField.multiply(sum, mTwo);
    if ((n & 1) == 0) {
      final E c = mS.coeff(n / 2);
      sum = mElementField.add(sum, mElementField.multiply(c, c));
    }
    return sum;
  }

  @Override
  public long bound() {
    return mBound;
  }
}
