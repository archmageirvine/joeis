package irvine.math.series;

/**
 * The series <code>1+a*x^n</code>.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class OnePlusXToTheN<E> implements Series<E> {

  private final E mZero;
  private final E mOne;
  private final E mA;
  private final long mN;

  OnePlusXToTheN(final E zero, final E one, final E a, final long n) {
    mZero = zero;
    mOne = one;
    mA = a;
    mN = n;
  }

  @Override
  public E coeff(final long n) {
    return n == mN ? mA : n == 0 ? mOne : mZero;
  }

  @Override
  public long bound() {
    return mN;
  }
}
