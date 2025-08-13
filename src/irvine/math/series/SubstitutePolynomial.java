package irvine.math.series;

import irvine.math.api.Field;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Substitute a series for the unknown in a polynomial.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class SubstitutePolynomial<E> implements Series<E> {

  private final SeriesRing<E> mRing;
  private final Field<E> mElementField;
  private final Polynomial<E> mS;
  private final Series<E> mT;
  private final int mBound;

  SubstitutePolynomial(final SeriesRing<E> ring, final Polynomial<E> s, final Series<E> t) {
    mRing = ring;
    mElementField = ring.coefficientField();
    mS = s;
    mT = t;
    final Z b = Z.valueOf(mT.bound()).multiply(mS.degree());
    mBound = b.bitLength() < Integer.SIZE ? b.intValue() : Integer.MAX_VALUE;
  }

  @Override
  public E coeff(final int n) {
    // [x^n] s(t(x)) = Sum_{k=0..n} s(k) * [x^n] t(x)^k
    E sum = mElementField.zero();
    if (n <= mBound) {
      Series<E> tk = mRing.one();
      for (int k = 0; k <= mS.degree(); ++k) {
        final E sk = mS.coeff(k);
        if (!mElementField.isZero(sk)) {
          sum = mElementField.add(sum, mElementField.multiply(sk, tk.coeff(n)));
        }
        tk = mRing.multiply(tk, mT);
      }
    }
    return sum;
  }

  @Override
  public int bound() {
    return mBound;
  }
}
