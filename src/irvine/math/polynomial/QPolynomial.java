package irvine.math.polynomial;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Container for the coefficients of a polynomial with rational powers.
 *
 * @author Sean A. Irvine
 * @param <E> underlying type
 */
public class QPolynomial<E> extends TreeMap<Q, E> {

  /**
   * Helper convenience method for the common task of creating an integer
   * polynomial.
   * @param coeffs integer coefficients
   * @return polynomial over integers
   */
  public static QPolynomial<Z> create(final long... coeffs) {
    final QPolynomial<Z> c = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    for (int k = 0; k < coeffs.length; ++k) {
      if (coeffs[k] != 0) {
        c.put(new Q(k), Z.valueOf(coeffs[k]));
      }
    }
    return c;
  }

  /**
   * Helper convenience method for the common task of creating an integer
   * polynomial.
   * @param coeffs integer coefficients
   * @return polynomial over integers
   */
  public static QPolynomial<Z> create(final List<Z> coeffs) {
    final QPolynomial<Z> c = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    for (int k = 0; k < coeffs.size(); ++k) {
      if (!coeffs.get(k).isZero()) {
        c.put(new Q(k), coeffs.get(k));
      }
    }
    return c;
  }

  private final E mZero;
  private final E mOne;
  private final String mIndeterminate;

  /**
   * Construct an empty polynomial.
   * @param indeterminate symbol to use for the indeterminate
   * @param zero zero in underlying type
   * @param one one in underlying type
   */
  public QPolynomial(final String indeterminate, final E zero, final E one) {
    mIndeterminate = indeterminate;
    mZero = zero;
    mOne = one;
  }

  /**
   * Return the specified coefficient with 0 corresponding to the constant term.
   *
   * @param n coefficient index
   * @return value of coefficient
   * @exception IllegalArgumentException if <code>n</code> is negative.
   */
  public E coeff(final Q n) {
    final E res = get(n);
    return res == null ? mZero : res;
  }

  /**
   * Return the specified coefficient with 0 corresponding to the constant term.
   *
   * @param n coefficient index
   * @return value of coefficient
   * @exception IllegalArgumentException if <code>n</code> is negative.
   */
  public E coeff(final int n) {
    return coeff(new Q(n));
  }

  /**
   * Return the largest degree of the polynomial.
   *
   * @return the degree
   */
  public Q degree() {
    return isEmpty() ? Q.ZERO : lastKey();
  }

  /**
   * Truncate this polynomial at the specified degree. All higher order
   * terms are discarded.
   *
   * @param degree degree
   * @return truncated polynomial
   */
  public QPolynomial<E> truncate(final Q degree) {
    if (degree.compareTo(degree()) >= 0) {
      return this;
    }
    final QPolynomial<E> p = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : entrySet()) {
      if (e.getKey().compareTo(degree) <= 0) {
        p.put(e.getKey(), e.getValue());
      }
    }
    return p;
  }

  private String protect(final String s) {
    return s.indexOf('+') >= 0 ? "(" + s + ")" : s;
  }

  @Override
  public String toString() {
    if (size() == 0) {
      return mZero.toString();
    }
    final StringBuilder sb = new StringBuilder();
    for (final Map.Entry<Q, E> e : entrySet()) {
      final Q k = e.getKey();
      final E c = e.getValue();
      if (!mZero.equals(c)) {
        // Because E can be essentially any type, it is difficult to easily
        // handle negative quantities making a pretty printing.  Therefore,
        // we resort to actually rendering the element as a string and
        // checking if it looks like it starts with a "-" sign.
        // Further the individual elements can themselves be composite
        // items (like polynomials), so a further check is made, if the
        // element contains a "+" it is enclosed in parentheses.
        final String eString = protect(c.toString());
        if (!eString.isEmpty() && eString.charAt(0) == '-') {
          if ("-1".equals(eString) && !Q.ZERO.equals(k)) {
            sb.append('-');
          } else {
            sb.append(eString);
          }
        } else {
          if (sb.length() > 0) {
            sb.append('+');
          }
          if (Q.ZERO.equals(k) || !mOne.equals(c)) {
            sb.append(eString);
          }
        }
        if (!Q.ZERO.equals(k)) {
          sb.append(mIndeterminate);
          if (!Q.ONE.equals(k)) {
            if (k.toString().length() <= 1) {
              sb.append('^').append(k);
            } else {
              sb.append("^{").append(k).append('}');
            }
          }
        }
      }
    }
    return sb.toString();
  }

  /**
   * Expand the polynomial by making the substitution <code>x=x^power</code>.
   * @param power power
   * @param max maximum degree
   * @return substituted polynomial
   */
  public QPolynomial<E> substitutePower(final Q power, final Q max) {
    if (Q.ONE.equals(power)) {
      return this;
    }
    final QPolynomial<E> c = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : entrySet()) {
      final Q p = e.getKey().multiply(power);
      if (p.compareTo(max) <= 0) {
        c.put(p, e.getValue());
      }
    }
    return c;
  }

  /**
   * Expand the polynomial by making the substitution <code>x=x^power</code>.
   * @param power power
   * @return substituted polynomial
   */
  public QPolynomial<E> substitutePower(final Q power) {
    if (Q.ONE.equals(power)) {
      return this;
    }
    final QPolynomial<E> c = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : entrySet()) {
      c.put(e.getKey().multiply(power), e.getValue());
    }
    return c;
  }

  /**
   * Expand the polynomial by making the substitution <code>x=x^power</code>.
   * @param power power
   * @param degreeLimit maximum degree
   * @return substituted polynomial
   */
  public QPolynomial<E> substitutePower(final int power, final Q degreeLimit) {
    return substitutePower(new Q(power), degreeLimit);
  }

  /**
   * Expand the polynomial by making the substitution <code>x=x^power</code>.
   * @param power power
   * @return substituted polynomial
   */
  public QPolynomial<E> substitutePower(final int power) {
    return substitutePower(new Q(power));
  }

  /**
   * Return this polynomial multiplied by <code>x^n</code>.
   * @param n nonnegative power
   * @return shifted polynomial
   * @exception IllegalArgumentException if <code>n</code> is less than 0
   */
  public QPolynomial<E> shift(final Q n) {
    if (Q.ZERO.equals(n)) {
      return this;
    }
    final QPolynomial<E> c = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : entrySet()) {
      c.put(e.getKey().add(n), e.getValue());
    }
    return c;
  }

  /**
   * Return this polynomial multiplied by <code>x^n</code>.
   * @param n nonnegative power
   * @return shifted polynomial
   * @exception IllegalArgumentException if <code>n</code> is less than 0
   */
  public QPolynomial<E> shift(final int n) {
    return shift(new Q(n));
  }

  @Override
  public E put(final Q key, final E value) {
    if (mZero.equals(value)) {
      return remove(key);
    } else {
      return super.put(key, value);
    }
  }

  /**
   * Convert to an ordinary polynomial (all non-integral powers will be lost).
   * @return polynomial
   */
  public Polynomial<E> toPolynomial() {
    final Polynomial<E> res = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = 0; k <= degree().toZ().intValue(); ++k) {
      res.add(coeff(k));
    }
    return res;
  }
}
