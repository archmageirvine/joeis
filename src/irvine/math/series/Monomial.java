package irvine.math.series;

/**
 * The monomial <code>a*x^n</code> series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class Monomial<E> implements Series<E> {

  private final E mZero;
  private final E mA;
  private final int mN;

  Monomial(final E zero, final E a, final int n) {
    mZero = zero;
    mA = a;
    mN = n;
  }

  @Override
  public E coeff(final int n) {
    return n == mN ? mA : mZero;
  }

  @Override
  public int bound() {
    return mN;
  }
}
