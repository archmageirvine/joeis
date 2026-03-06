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
  private final long mE;
  private final long mBound;

  SubstitutePower(final E zero, final Series<E> s, final long e) {
    mZero = zero;
    mS = s;
    mE = e;
    final Z b = Z.valueOf(mS.bound()).multiply(e);
    mBound = b.bitLength() < Long.SIZE ? b.longValue() : Long.MAX_VALUE;
  }

  @Override
  public E coeff(final long n) {
    return n % mE == 0 ? mS.coeff(n / mE) : mZero;
  }

  @Override
  public long bound() {
    return mBound;
  }
}
