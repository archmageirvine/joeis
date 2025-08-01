package irvine.math.series;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import irvine.math.api.Field;
import irvine.math.function.Functions;
import irvine.math.group.AbstractRing;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;
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
  public String toString() {
    return mElementField + "[x]";
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
  public Z characteristic() {
    return mElementField.characteristic();
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
  public Series<E> coerce(final long n) {
    return create(mElementField.coerce(n));
  }

  @Override
  public Series<E> coerce(final Z n) {
    return create(mElementField.coerce(n));
  }

  /**
   * Return a cached version of the series.
   * Normal use cases should not need to call this, other functions in this
   * call already use caching where appropriate.
   * @param s series
   * @return cached series
   */
  public Series<E> cache(final Series<E> s) {
    return new CachedSeries<>(s);
  }

  @Override
  public Series<E> negate(final Series<E> s) {
    return n -> mElementField.negate(s.coeff(n));
  }

  @Override
  public Series<E> add(final Series<E> a, final Series<E> b) {
    return cache(n -> mElementField.add(a.coeff(n), b.coeff(n)));
  }

  @Override
  public Series<E> subtract(final Series<E> a, final Series<E> b) {
    return cache(n -> mElementField.subtract(a.coeff(n), b.coeff(n)));
  }

  @Override
  public Series<E> multiply(final Series<E> a, final Series<E> b) {
    return cache(n -> mElementField.sum(0, n, k -> mElementField.multiply(a.coeff(k), b.coeff(n - k))));
  }

  /**
   * Return the series multiplied by the specified value.
   * @param s series
   * @param n multiplicand
   * @return series
   */
  public Series<E> multiply(final Series<E> s, final E n) {
    if (mOne.equals(n)) {
      return s;
    }
    if (mZero.equals(n)) {
      return zero();
    }
    return m -> mElementField.multiply(n, s.coeff(m));
  }

  /**
   * Series convolution or Hadamard product of two series.
   * @param a first series
   * @param b second series
   * @return Hadamard product
   */
  public Series<E> hadamardMultiply(final Series<E> a, final Series<E> b) {
    return n -> mElementField.multiply(a.coeff(n), b.coeff(n));
  }

  /**
   * Return the series multiplied by <code>x^n</code>.
   * Works for positive, zero, and negative <code>n</code>.
   * @param s series
   * @param n power
   * @return shifted series
   */
  public Series<E> shift(final Series<E> s, final int n) {
    // Note: avoids requesting negative powers from the underlying series.
    // In some cases, it would be possible to make that work, but overall it is
    // better to avoid triggering calculations of negative powers in s.
    return m -> m - n >= 0 ? s.coeff(m - n) : mElementField.zero();
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
   * Truncate a series at <code>x^n</code>
   * All coefficients &gt; <code>n</code> will return 0.
   * Note this does not save or release any memory associated with <code>s</code>.
   * @param s series to truncate
   * @return truncated series
   */
  public Series<E> truncate(final Series<E> s, final int n) {
    return m -> m > n ? mElementField.zero() : s.coeff(m);
  }

  /**
   * Left truncate a series at <code>x^n</code>
   * All coefficients &lt; <code>n</code> will return 0.
   * Equivalent to Pari <code>serchop</code>
   * @param s series to truncate
   * @return truncated series
   */
  public Series<E> leftTruncate(final Series<E> s, final int n) {
    return m -> m < n ? mElementField.zero() : s.coeff(m);
  }

  /**
   * Return the series <code>1+a*x^n</code>.
   * @param a coefficient
   * @param n the power
   * @return the series
   */
  public Series<E> onePlusXToTheN(final E a, final int n) {
    // Special case here for n==0, where [x^0] becomes 1+a
    return n == 0
      ? m -> m == 0 ? mElementField.add(a, mElementField.one()) : mElementField.zero()
      : m -> m == 0 ? mElementField.one() : m == n ? a : mElementField.zero();
  }

  /**
   * Return the series <code>1+x^n</code>.
   * @param n the power
   * @return the series
   */
  public Series<E> onePlusXToTheN(final int n) {
    return onePlusXToTheN(mElementField.one(), n);
  }

  /**
   * Return the series <code>1-a*x^n</code>.
   * @param a coefficient
   * @param n the power
   * @return the series
   */
  public Series<E> oneMinusXToTheN(final E a, final int n) {
    // Special case here for n==0, where [x^0] becomes 1-a
    final E negA = mElementField.negate(a);
    return n == 0
      ? m -> m == 0 ? mElementField.subtract(mElementField.one(), a) : mElementField.zero()
      : m -> m == 0 ? mElementField.one() : m == n ? negA : mElementField.zero();
  }

  /**
   * Return the series <code>1-x^n</code>.
   * @param n the power
   * @return the series
   */
  public Series<E> oneMinusXToTheN(final int n) {
    return oneMinusXToTheN(mElementField.one(), n);
  }

  /**
   * Return the monomial series <code>ax^n</code>.
   * @param a coefficient
   * @param n power
   * @return monomial
   */
  public Series<E> monomial(final E a, final int n) {
    return m -> m == n ? a : mElementField.zero();
  }

  /**
   * Raise a series to a power.
   * @param s the series
   * @param n power
   * @return <code>s^n</code>
   * @throws IllegalArgumentException if <code>n&lt;0</code>
   */
  public Series<E> pow(final Series<E> s, final long n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n <= 3) {
      switch ((int) n) {
        case 0:
          return one();
        case 1:
          return s;
        case 2:
          return multiply(s, s);
        case 3:
        default:
          return multiply(multiply(s, s), s);
      }
    }
    final Series<E> u = pow(s, n / 2);
    final Series<E> t = multiply(u, u);
    return (n & 1) == 0 ? t : multiply(t, s);
  }

  /**
   * Raise a series to a power.
   * @param s the series
   * @param n power
   * @return <code>s^n</code>
   */
  public Series<E> pow(final Polynomial<E> s, final Z n) {
    if (n.isZero()) {
      return one();
    } else if (Z.ONE.equals(n)) {
      return s;
    } else if (Z.TWO.equals(n)) {
      return multiply(s, s);
    } else {
      final Series<E> u = pow(s, n.divide2());
      final Series<E> t = multiply(u, u);
      return n.isEven() ? t : multiply(t, s);
    }
  }

  /**
   * Substitute <code>x^e</code> for <code>x</code> in a series.
   * Equivalent to, but more efficient than, <code>substitute(s, monomial(one, e))</code>.
   * @param s series
   * @param e power to substitute
   * @return substituted series
   */
  public Series<E> substitute(final Series<E> s, final int e) {
    // [x^n] s(x^k) = [x^(n/k)] s(x) when n % k == 0
    return n -> n % e == 0 ? s.coeff(n / e) : mElementField.zero();
  }

  /**
   * Substitute a series for the unknown in another series.
   * @param s series
   * @param v series to substitute
   * @return substituted series
   */
  public Series<E> substitute(final Series<E> s, final Series<E> v) {
    // [x^n] s(v(x)) = Sum_{k=..n} s(k) * v(n-k)
    return cache(n -> mElementField.sum(0, n, k -> mElementField.multiply(s.coeff(k), v.coeff(n - k))));
  }

  /**
   * Replaces the power series sum of <code>a_n*x^n/n!</code> by sum of <code>a_n*x^n</code>.
   * @param s series
   * @return Laplace series
   */
  public Series<E> serlaplace(final Series<E> s) {
    return n -> mElementField.multiply(s.coeff(n), mElementField.coerce(Functions.FACTORIAL.z(n)));
  }

  /**
   * Compute a Dedekind eta series of another series.
   * @param s series
   * @return eta series
   */
  public Series<E> eta(final Series<E> s) {
    return new DedekindEta<>(this, s);
  }


  // todo a/b

  // todo toString() & eval() to some distance
}
