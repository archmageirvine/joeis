package irvine.math.series;

import irvine.math.api.Field;
import irvine.math.z.Z;

/**
 * Substitute a series for the unknown in another series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class SubstituteSeries<E> implements Series<E> {

  private final SeriesRing<E> mRing;
  private final Field<E> mElementField;
  private final Series<E> mS;
  private final Series<E> mT;
  private final int mBound;

  SubstituteSeries(final SeriesRing<E> ring, final Series<E> s, final Series<E> t) {
    mRing = ring;
    mElementField = ring.coefficientField();
    mS = s;
    mT = t;
    final Z b = Z.valueOf(mT.bound()).multiply(mS.bound());
    mBound = b.bitLength() < Integer.SIZE ? b.intValue() : Integer.MAX_VALUE;
  }

  @Override
  public E coeff(final int n) {
    // todo: use Bell polynomials to accelerate?

    // [x^n] s(t(x)) = Sum_{k=0..n} s(k) * [x^n] t(x)^k
    if (n == 0) {
      return mS.coeff(0);
    }
    E sum = mElementField.zero();
    Series<E> tk = mT;
    for (int k = 1; k <= Math.min(n, mS.bound()); ++k) {
      final E sk = mS.coeff(k);
      if (!mElementField.isZero(sk)) {
        sum = mElementField.add(sum, mElementField.multiply(sk, tk.coeff(n)));
      }
      tk = mRing.multiply(tk, mT);
    }
    return sum;
  }

  @Override
  public int bound() {
    return mBound;
  }
}
