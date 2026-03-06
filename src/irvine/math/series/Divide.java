package irvine.math.series;

import irvine.math.MemoryFunction;
import irvine.math.api.Field;

/**
 * Cache the ratio of two series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Divide<E> extends MemoryFunction<Long, E> implements Series<E> {

  // [x^n] s(x)/t(x) = (1/t_0)(s_n - Sum_{k=1..n} u_{n-k}t_k), assuming t_0 != 0.
  private final Field<E> mElementField;
  private final Series<E> mS;
  private final Series<E> mT;

  Divide(final Field<E> elementField, final Series<E> s, final Series<E> t) {
    if (elementField.isZero(t.coeff(0))) {
      throw new UnsupportedOperationException("t is not a formal power series with t0!=0");
    }
    mElementField = elementField;
    mS = s;
    mT = t;
  }

  @Override
  protected E compute(final Long n) {
    if (n < 0) {
      return mElementField.zero();
    }
    final E sum = mElementField.sum(1, Math.min(n, mT.bound()), k -> mElementField.multiply(getValue(n - k), mT.coeff(k)));
    return mElementField.divide(mElementField.subtract(mS.coeff(n), sum), mT.coeff(0));
  }

  @Override
  public E coeff(final long n) {
    return getValue(n);
  }

  @Override
  public long bound() {
    return Long.MAX_VALUE;
  }
}
