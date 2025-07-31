package irvine.math.series;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import irvine.math.api.Field;
import irvine.math.group.AbstractRing;
import irvine.math.group.IntegerField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A formal power series ring over an underlying field.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public class SeriesRing<E> extends AbstractRing<Series<E>> {

  // todo at the moment underlying type could get away with ring, but for division later I think a field will be needed
  // todo "SeriesRing" might not be final name here, if I can get division working (Taylor series expansion)

  /** Formal power series ring over integers. */
  public static final SeriesRing<Z> SZ = new SeriesRing<>(IntegerField.SINGLETON);
  /** Formal power series ring over rationals. */
  public static final SeriesRing<Q> SQ = new SeriesRing<>(Rationals.SINGLETON);

  private final Field<E> mElementField;
  private final Series<E> mZero;
  private final Series<E> mOne;
  private final Series<E> mX;

  /**
   * Construct a ring of formal power series over a given field.
   * @param field underlying element field
   */
  public SeriesRing(final Field<E> field) {
    mElementField = field;
    mZero = n -> mElementField.zero();
    mOne = n -> n == 0 ? mElementField.one() : mElementField.zero();
    mX = n -> n == 1 ? mElementField.one() : mElementField.zero();
  }

  @Override
  public Series<E> zero() {
    return mZero;
  }

  @Override
  public Series<E> one() {
    return mOne;
  }

  /**
   * Return the series <code>x</code>.
   * @return <code>x</code>
   */
  public Series<E> x() {
    return mX;
  }

  @Override
  public boolean isCommutative() {
    return mElementField.isCommutative();
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final Series<E> element) {
    return element != null;
  }

  @Override
  public Iterator<Series<E>> iterator() {
    // Essentially the same implementation as PolynomialRing.iterator()
    return new Iterator<>() {
      // Generate all degree 0, then all degree 1, and so on.
      // For an infinite element this never gets above the 0th coefficient.
      private final ArrayList<E> mCoeffs = new ArrayList<>();
      private final ArrayList<Iterator<E>> mIterators = new ArrayList<>();

      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public Series<E> next() {
        int k = 0;
        while (true) {
          if (k >= mCoeffs.size()) {
            mIterators.add(mElementField.iterator());
            if (k > 0) {
              mIterators.get(k).next(); // skip the 0 of the underlying field
            }
            mCoeffs.add(mIterators.get(k).next());
          }
          if (mIterators.get(k).hasNext()) {
            mCoeffs.set(k, mIterators.get(k).next());
            return new FiniteSeries<>(mElementField.zero(), mCoeffs);
          } else {
            mIterators.set(k, mElementField.iterator());
            mCoeffs.set(k, mIterators.get(k).next());
            ++k;
          }
        }
      }
    };
  }

  /**
   * Create a finite series from the given list of terms.
   * @param coeffs coefficients
   * @return series
   */
  public Series<E> create(final List<E> coeffs) {
    return new FiniteSeries<>(mElementField.zero(), coeffs);
  }

  /**
   * Create a finite series from the given array of terms.
   * @param coeffs coefficients
   * @return series
   */
  @SafeVarargs
  public final Series<E> create(final E... coeffs) {
    return new FiniteSeries<>(mElementField.zero(), List.of(coeffs));
  }

  @Override
  public Series<E> negate(final Series<E> s) {
    return n -> mElementField.negate(s.coeff(n));
  }

  @Override
  public Series<E> add(final Series<E> a, final Series<E> b) {
    return new CachedSeries<>(n -> mElementField.add(a.coeff(n), b.coeff(n)));
  }

  @Override
  public Series<E> multiply(final Series<E> a, final Series<E> b) {
    return new CachedSeries<>(n -> mElementField.sum(0, n, k -> mElementField.multiply(a.coeff(k), b.coeff(n - k))));
  }

  /**
   * Return the derivative of a series.
   * @param s series to take derivative of
   * @return derivative
   */
  public Series<E> diff(final Series<E> s) {
    return n -> mElementField.multiply(s.coeff(n + 1), mElementField.coerce(n + 1));
  }

  /**
   * Return the series <code>1+a*x^n</code>.
   * @param a coefficient
   * @param n the power
   * @return the series
   */
  public Series<E> onePlusXToTheN(final E a, final int n) {
    return m -> m == 1 ? mElementField.one() : m == n ? a : mElementField.zero();
  }

  /**
   * Return the series <code>1+x^n</code>.
   * @param n the power
   * @return the series
   */
  public Series<E> onePlusXToTheN(final int n) {
    // todo is this right if n == 1
    return m -> m == 1 || m == n ? mElementField.one() : mElementField.zero();
  }

  // todo a/b

  // todo toString() to some distance
}
