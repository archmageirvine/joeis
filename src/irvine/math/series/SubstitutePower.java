package irvine.math.series;

import irvine.math.z.Z;

/**
 * Substitute <code>x^e</code> for <code>x</code> in a power series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class SubstitutePower<E> implements Series<E> {

  private final E mZero;
  private final Series<E> mS;
  private final int mE;
  private final int mBound;

  SubstitutePower(final E zero, final Series<E> s, final int e) {
    mZero = zero;
    mS = s;
    mE = e;
    final Z b = Z.valueOf(mS.bound()).multiply(e);
    mBound = b.bitLength() < Integer.SIZE ? b.intValue() : Integer.MAX_VALUE;
  }

  @Override
  public E coeff(final int n) {
    return n % mE == 0 ? mS.coeff(n / mE) : mZero;
  }

  @Override
  public int bound() {
    return mBound;
  }
}
