package irvine.math.series;

import irvine.math.MemoryFunction1;
import irvine.math.api.Field;
import irvine.math.z.Z;

/**
 * Cache the power of a series.
 * Detection of a trivial power <code>n=0</code> or <code>n=1</code> should be
 * done outside this code.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Power<E> extends MemoryFunction1<E> implements Series<E> {

  // [x^m] s(x)^n = c(m) = (1/(m*s_0)) * Sum_{k=1..m} (k*n-m+k)*s(k)*c(m-k).
  private final Field<E> mElementField;
  private final Series<E> mS;
  private final long mN;
  private final int mBound;

  Power(final Field<E> elementField, final Series<E> s, final long n) {
    if (elementField.isZero(s.coeff(0))) {
      throw new UnsupportedOperationException("t is not a formal power series with t0!=0");
    }
    mElementField = elementField;
    mS = s;
    mN = n;
    if (s.bound() == Integer.MAX_VALUE || n < 0) {
      mBound = Integer.MAX_VALUE;
    } else {
      final Z b = Z.valueOf(s.bound()).pow(n);
      mBound = b.bitLength() < Integer.SIZE ? b.intValue() : Integer.MAX_VALUE;
    }
  }

  @Override
  protected E compute(final int m) {
    if (m == 0) {
      return mElementField.pow(mS.coeff(0), mN);
    }
    // Some potential for overflow in k * mN -- if necessary this could be made to work over Z
    final E sum = mElementField.sum(1, Math.min(m, mS.bound()), k -> mElementField.multiply(get(m - k), mElementField.multiply(mS.coeff(k), mElementField.coerce(k * mN - m + k))));
    return mElementField.divide(sum, mElementField.multiply(mS.coeff(0), mElementField.coerce(m)));
  }

  @Override
  public E coeff(final int n) {
    return get(n);
  }

  @Override
  public int bound() {
    return mBound;
  }
}
