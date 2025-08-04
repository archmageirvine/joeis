package irvine.math.series;

import java.util.Iterator;
import java.util.List;

import irvine.math.api.Field;
import irvine.math.function.Functions;
import irvine.math.group.AbstractRing;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A formal power series ring over an underlying field.
 * This implementation is essentially lazy and does not explicitly compute terms of
 * the series unless they are explicitly needs via a <code>coeff</code> call. It
 * does use caching where appropriate so avoid costly repeat computations.
 * @param <E> underlying element type
 * @author Sean A. Irvine
 */
public class SeriesRing<E> extends AbstractRing<Series<E>> {

  // todo finite cases
  //  - memory and (perhaps) efficiency could be improved by directly supporting finite series
  //  - potentially can be done by detecting FiniteSeries, Polynomial, or similar for those cases since Polynomial implements Series

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
    final Iterator<Polynomial<E>> it = new PolynomialRingField<>(mElementField).iterator();
    return new Iterator<>() {
      @Override
      public boolean hasNext() {
        return it.hasNext();
      }
      @Override
      public Series<E> next() {
        return it.next();
      }
    };
  }

  /**
   * Get the field of the series coefficients.
   * @return coefficient field
   */
  public Field<E> coefficientField() {
    return mElementField;
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
  public Series<E> add(final Series<E> s, final Series<E> t) {
    return cache(n -> mElementField.add(s.coeff(n), t.coeff(n)));
  }

  @Override
  public Series<E> subtract(final Series<E> s, final Series<E> t) {
    return cache(n -> mElementField.subtract(s.coeff(n), t.coeff(n)));
  }

  @Override
  public Series<E> multiply(final Series<E> s, final Series<E> t) {
    return cache(n -> mElementField.sum(0, n, k -> mElementField.multiply(s.coeff(k), t.coeff(n - k))));
  }

  /**
   * Convenience method to square a series.
   * Equivalent to <code>multiply(x, x)</code> or <code>pow(s, 2)</code>.
   * @param s series
   * @return squared series
   */
  public Series<E> square(final Series<E> s) {
    return multiply(s, s);
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
    return m -> mElementField.multiply(s.coeff(m), n);
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
   * Return the series divided by the specified value.
   * @param s series
   * @param n divisor
   * @return series
   */
  public Series<E> divide(final Series<E> s, final E n) {
    if (mOne.equals(n)) {
      return s;
    }
    if (mZero.equals(n)) {
      return zero();
    }
    return m -> mElementField.divide(s.coeff(m), n);
  }

  /**
   * Return one series divided by another.
   * @param s numerator
   * @param t denominator
   * @return series
   */
  public Series<E> divide(final Series<E> s, final Series<E> t) {
    // DivisionSeries does its own caching, so we do not need an additional cache here.
    // In general, we cannot tell if t is 0, but we can at least check the specific constant
    if (zero() == t) {
      throw new IllegalArgumentException("Division by 0");
    }
    if (mElementField.zero().equals(t.coeff(0))) {
      // t is not technically a formal power series.
      // We try to "shift" it down u(x) = x^k*t(x) where k is the least non-zero term of t.
      // This shifting will eventually fail if t is 0.
      // Then we form s(x)/u(x) for which [x^n] s(x)/t(x) = [x^(n-k)] s(x)/u(x)
      int k = 1;
      while (mElementField.zero().equals(t.coeff(k))) {
        if (++k <= 0) {
          throw new RuntimeException("Divisor is 0 or very high order");
        }
      }
      final int shift = k;
      // This will actually be valid for -shift <= n as well, a Laurent series,
      // although many functions will be oblivious to those terms.
      return n -> new Divide<>(mElementField, s, m -> t.coeff(m + shift)).coeff(n + shift);
    }
    return new Divide<>(mElementField, s, t);
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
   * Return the formal integral of a series.
   * @param s series to take integral of
   * @return derivative
   */
  public Series<E> integrate(final Series<E> s) {
    return n -> n == 0 ? mElementField.zero() : mElementField.divide(s.coeff(n - 1), mElementField.coerce(n));
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
  public Series<E> pow(final Series<E> s, final Z n) {
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
   * Substitute a series for the unknown in a polynomial.
   * The first argument needs to be of finite degree to ensure a computable result.
   * @param s polynomial
   * @param t series to substitute
   * @return substituted series
   */
  public Series<E> substitute(final Polynomial<E> s, final Series<E> t) {
    // [x^n] s(t(x)) = Sum_{k=0..n} s(k) * [x^n] t(x)^k
    return n -> {
      E sum = mElementField.zero();
      Series<E> tk = one();
      for (int k = 0; k <= s.degree(); ++k) {
        final E sk = s.coeff(k);
        if (!mElementField.zero().equals(sk)) {
          sum = mElementField.add(sum, mElementField.multiply(sk, tk.coeff(n)));
        }
        tk = multiply(tk, t);
      }
      return sum;
    };
  }

  /**
   * Substitute a series for the unknown in another series.
   * The second argument must not have a constant term.
   * @param s series to substitute into
   * @param t series to substitute
   * @return substituted series
   */
  public Series<E> substitute(final Series<E> s, final Series<E> t) {
    if (!t.coeff(0).equals(mElementField.zero())) {
      throw new UnsupportedOperationException("Cannot have constant term in t");
    }

    // todo: use Bell polynomials to accelerate?
    // todo: if we have a way of telling finite we can combine this previous method

    // [x^n] s(t(x)) = Sum_{k=0..n} s(k) * [x^n] t(x)^k
    return n -> {
      if (n == 0) {
        return s.coeff(0);
      }
      E sum = mElementField.zero();
      Series<E> tk = t;
      for (int k = 1; k <= n; ++k) {
        final E sk = s.coeff(k);
        if (!mElementField.zero().equals(sk)) {
          sum = mElementField.add(sum, mElementField.multiply(sk, tk.coeff(n)));
        }
        tk = multiply(tk, t);
      }
      return sum;
    };
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
   * Compute a Dedekind eta series.
   * @return eta series
   */
  public Series<E> eta() {
    return new Series<>() {
      private Series<E> mEta = oneMinusXToTheN(1);
      private int mK = 1;

      @Override
      public E coeff(final int n) {
        while (n > mK) {
          mEta = multiply(mEta, oneMinusXToTheN(++mK));
        }
        return mEta.coeff(n);
      }
    };
  }

  private boolean isDigitsOnly(final String s) {
    // Also allows "." for CR
    return s.matches("[0-9.]*");
  }

  /**
   * Return an explicit string representation of a series up to the specified degree.
   * @param s series
   * @param n maximum degree
   * @return string representation
   */
  public String toString(final Series<E> s, final int n) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k <= n; ++k) {
      final E c = s.coeff(k);
      if (!mElementField.zero().equals(c)) {
        final String sc = c.toString();
        boolean multNeeded = false;
        if (sc.startsWith("-")) {
          final String sc1 = sc.substring(1);
          if (isDigitsOnly(sc1)) {
            if (mElementField.one().equals(mElementField.negate(c))) {
              sb.append('-');
            } else {
              sb.append(sc);
              multNeeded = true;
            }
          } else {
            // e.g. something like -1/2
            sb.append("-(").append(sc1).append(')');
            multNeeded = true;
          }
        } else {
          if (sb.length() > 0) {
            sb.append('+');
          }
          if (k == 0 || !mElementField.one().equals(c)) {
            if (isDigitsOnly(sc)) {
              sb.append(sc);
            } else {
              sb.append('(').append(sc).append(')');
            }
            multNeeded = true;
          }
        }
        if (k > 0) {
          if (multNeeded) {
            sb.append('*');
          }
          if (k == 1) {
            sb.append('x');
          } else {
            sb.append("x^").append(k);
          }
        }
      }
    }
    return sb.length() == 0 ? "0" : sb.toString();
  }

  /**
   * Convert this series to a polynomial of specified maximum degree.
   * @param s series
   * @param n maximum degree
   * @return polynomial
   */
  public Polynomial<E> toPolynomial(final Series<E> s, final int n) {
    final Polynomial<E> p = new PolynomialRing<>(mElementField).empty();
    for (int k = 0; k <= n; ++k) {
      p.add(s.coeff(k));
    }
    return p;
  }

  /**
   * Evaluate the series at <code>x</code>.
   * Essentially the same as <code>toPolynomial(s, n).eval(x)</code>
   * @param s series
   * @param x value to substitute
   * @param n maximum degree term to include in sum
   * @return polynomial
   */
  public E eval(final Series<E> s, final E x, final int n) {
    E sum = mElementField.zero();
    E xk = mElementField.one();
    for (int k = 0; k <= n; ++k, xk = mElementField.multiply(xk, x)) {
      sum = mElementField.add(sum, mElementField.multiply(s.coeff(k), xk));
    }
    return sum;
  }
}
