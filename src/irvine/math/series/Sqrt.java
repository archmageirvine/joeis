package irvine.math.series;

import irvine.math.api.Field;

/**
 * Square root of a series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Sqrt<E> implements Series<E> {

  private final Series<E> mS;

  Sqrt(final SeriesRing<E> ring, final Series<E> s) {
    final Field<E> elementField = ring.coefficientField();
    int m = 0;
    while (elementField.isZero(s.coeff(m))) {
      ++m;
    }
    if ((m & 1) != 0 || !elementField.isOne(s.coeff(m))) {
      throw new UnsupportedOperationException(s.toString());
    }

    // sqrt(x^m * f(x)) m even is x^(m/2) * sqrt(f(x))
    final E half = elementField.divide(elementField.one(), elementField.coerce(2));
    mS = ring.shift(ring.powE(ring.shift(s, -m), half), m / 2);
  }

  @Override
  public E coeff(final int n) {
    return mS.coeff(n);
  }

  @Override
  public int bound() {
    return Integer.MAX_VALUE;
  }
}
