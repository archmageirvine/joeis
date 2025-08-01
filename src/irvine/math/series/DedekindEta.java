package irvine.math.series;

/**
 * Construct a Dedekind eta series.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
class DedekindEta<E> implements Series<E> {

  private final SeriesRing<E> mRing;
  private final Series<E> mS;
  private Series<E> mEta;
  private int mK = 1;

  /**
   * Construct a Dedekind eta series:
   * <code>product_{k>=1}(1-s(x)^k)</code>.
   * @param ring ring in which to create the series
   * @param s underlying series
   */
  DedekindEta(final SeriesRing<E> ring, final Series<E> s) {
    mRing = ring;
    mS = s;
    mEta = mRing.subtract(mRing.one(), s);
  }

  @Override
  public E coeff(final int n) {
    while (n > mK) {
      mEta = mRing.multiply(mEta, mRing.subtract(mRing.one(), mRing.pow(mS, ++mK)));
    }
    return mEta.coeff(n);
  }
}
