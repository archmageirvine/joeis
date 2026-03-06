package irvine.math.series;

/**
 * The monomial <code>a*x^n</code> series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Monomial<E> implements Series<E> {

  private final E mZero;
  private final E mA;
  private final long mN;

  Monomial(final E zero, final E a, final long n) {
    mZero = zero;
    mA = a;
    mN = n;
  }

  @Override
  public E coeff(final long n) {
    return n == mN ? mA : mZero;
  }

  @Override
  public long bound() {
    return mN;
  }
}
