package irvine.math.series;

import irvine.math.MemoryFunction1;
import irvine.math.api.Field;

/**
 * Cache the power of a series to a field element.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class PowerE<E> extends MemoryFunction1<E> implements Series<E> {

  // NOTE: This method is flakey.  It appears to work in some circumstances
  // but can give wrong answers for integers, and non-monic rationals
  // Cf. corresponding method in PolynomialRingField

  private final Field<E> mElementField;
  private final Series<E> mS;
  private final E mPower;

  PowerE(final Field<E> elementField, final Series<E> s, final E power) {
    mElementField = elementField;
    mS = s;
    mPower = power;
  }

  @Override
  protected E compute(final int n) {
    if (n == 0) {
      return mElementField.one();
    }
    E bk = mElementField.zero();
    for (int j = 0; j < n; ++j) {
      final E d = mElementField.multiply(mPower, mElementField.coerce(n - j));
      final E t = mElementField.multiply(mElementField.multiply(mS.coeff(n - j), get(j)), mElementField.subtract(d, mElementField.coerce(j)));
      bk = mElementField.add(bk, t);
    }
    return mElementField.divide(bk, mElementField.coerce(n));
  }

  @Override
  public E coeff(final int n) {
    return get(n);
  }

  @Override
  public int bound() {
    return Integer.MAX_VALUE; // todo this could be refined
  }
}
