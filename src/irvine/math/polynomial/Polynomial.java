package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * Container for the coefficients of a polynomial.
 * @author Sean A. Irvine
 * @param <E> underlying type
 */
public class Polynomial<E> extends ArrayList<E> {

  /**
   * Helper convenience method for the common task of creating an integer polynomial.
   * @param coeffs integer coefficients
   * @return polynomial over integers
   */
  public static Polynomial<Z> create(final long... coeffs) {
    final ArrayList<Z> c = new ArrayList<>();
    for (final long v : coeffs) {
      c.add(Z.valueOf(v));
    }
    return new Polynomial<>(Z.ZERO, Z.ONE, c);
  }

  /**
   * Helper convenience method for the common task of creating an integer polynomial.
   * @param coeffs integer coefficients
   * @return polynomial over integers
   */
  public static Polynomial<Z> create(final Z... coeffs) {
    final ArrayList<Z> c = new ArrayList<>();
    Collections.addAll(c, coeffs);
    return new Polynomial<>(Z.ZERO, Z.ONE, c);
  }

  private final E mZero;
  private final E mOne;
  private final String mIndeterminate;

  /**
   * Adjust the polynomial to be correct in the presence of zeros. This ensures
   * that the degree command returns the correct value. It is only necessary to
   * call this method if you muck with the coefficients of the polynomial
   * directly.
   */
  public void fixDegree() {
    int d = degree();
    while (d >= 0 && mZero.equals(coeff(d))) {
      remove(d--);
    }
  }

  /**
   * Construct an empty polynomial.
   * @param indeterminate symbol to use for the indeterminate
   * @param zero zero in underlying type
   * @param one one in underlying type
   */
  public Polynomial(final String indeterminate, final E zero, final E one) {
    mIndeterminate = indeterminate;
    mZero = zero;
    mOne = one;
  }

  /**
   * Construct a new polynomial with specified coefficients. The first
   * coefficient is the constant term, the second coefficient the linear
   * term, the third coefficient the quadratic term, and so on.
   * @param indeterminate symbol to use for the indeterminate
   * @param zero zero in underlying type
   * @param one one in underlying type
   * @param coeff coefficients
   */
  public Polynomial(final String indeterminate, final E zero, final E one, final List<E> coeff) {
    this(indeterminate, zero, one);
    if (coeff == null) {
      throw new NullPointerException();
    }
    int lim = coeff.size() - 1;
    if (!(mZero instanceof CR)) {
      // Comparison to 0 is hard for CR, so assume user doesn't make a mistake in the case of CR
      while (lim >= 0 && mZero.equals(coeff.get(lim))) {
        --lim;
      }
    }
    for (int k = 0; k <= lim; ++k) {
      add(coeff.get(k));
    }
  }

  /**
   * Construct a new polynomial with specified coefficients. The first
   * coefficient is the constant term, the second coefficient the linear
   * term, the third coefficient the quadratic term, and so on.
   * @param zero zero in underlying type
   * @param one one in underlying type
   * @param coeff coefficients
   */
  public Polynomial(final E zero, final E one, final List<E> coeff) {
    this("x", zero, one, coeff);
  }

  /**
   * Return the degree of the polynomial.
   * @return the degree
   */
  public int degree() {
    return size() - 1;
  }

  /**
   * Return the specified coefficient with 0 corresponding to the constant term.
   * @param n coefficient index
   * @return value of coefficient
   * @exception IllegalArgumentException if <code>n</code> is negative.
   */
  public E coeff(final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n >= size()) {
      return mZero;
    }
    return get(n);
  }

  /**
   * Return the leading coefficient of the polynomial.
   * @return leading coefficient
   */
  public E leadingCoeff() {
    return coeff(degree());
  }

  /**
   * Truncate this polynomial at the specified degree. All higher order
   * terms are discarded.
   *
   * @param degree degree
   * @return truncated polynomial
   */
  public Polynomial<E> truncate(final int degree) {
    if (degree >= degree()) {
      return this;
    }
    final Polynomial<E> p = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = 0; k <= degree; ++k) {
      p.add(get(k));
    }
    fixDegree();
    return p;
  }

  private String protect(final String s) {
    return s.indexOf('+') >= 0 || s.lastIndexOf('-') >= 1 ? "(" + s + ")" : s;
  }

  @Override
  public String toString() {
    if (degree() <= 0) {
      if (degree() < 0) {
        return mZero.toString();
      }
      return coeff(0).toString();
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < size(); ++k) {
      final E c = coeff(k);
      if (!mZero.equals(c)) {
        // Because E can be essentially any type, it is difficult to easily
        // handle negative quantities making a pretty printing.  Therefore,
        // we resort to actually rendering the element as a string and
        // checking if it looks like it starts with a "-" sign.
        // Further the individual elements can themselves be composite
        // items (like polynomials), so a further check is made, if the
        // element contains a "+" or internal "-" it is enclosed in parentheses.
        final String eString = protect(c.toString());
        if (!eString.isEmpty() && eString.charAt(0) == '-') {
          if ("-1".equals(eString) && k != 0) {
            sb.append('-');
          } else {
            sb.append(eString);
          }
        } else {
          if (sb.length() > 0) {
            sb.append('+');
          }
          if (k == 0 || !mOne.equals(c)) {
            sb.append(eString);
          }
        }
        if (k > 0) {
          sb.append(mIndeterminate);
          if (k > 1) {
            sb.append('^').append(k);
          }
        }
      }
    }
    return sb.toString();
  }

  /**
   * Expand the polynomial by making the substitution <code>x=x^power</code>.
   * @param power power
   * @param maxDegree suggested maximum degree of term to retain
   * @return substituted polynomial
   * @exception IllegalArgumentException if power is less than 1.
   */
  public Polynomial<E> substitutePower(final int power, final int maxDegree) {
    if (power < 1) {
      throw new IllegalArgumentException();
    }
    if (power == 1) {
      return this;
    }
    final Polynomial<E> c = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = Math.min(maxDegree, degree() * power); k >= 0; --k) {
      c.add(mZero);
    }
    for (int k = 0, j = 0; k <= degree() && j <= maxDegree; ++k, j += power) {
      c.set(j, coeff(k));
    }
    return c;
  }

  /**
   * Expand the polynomial by making the substitution <code>x=x^power</code>.
   * @param power power
   * @return substituted polynomial
   * @exception IllegalArgumentException if power is less than 1.
   */
  public Polynomial<E> substitutePower(final int power) {
    return substitutePower(power, Integer.MAX_VALUE);
  }

  /**
   * Return this polynomial multiplied by <code>x^n</code>.
   * @param n power
   * @return shifted polynomial
   */
  public Polynomial<E> shift(final int n) {
    if (n <= 0) {
      if (n == 0) {
        return this;
      }
      final Polynomial<E> c = new Polynomial<>(mIndeterminate, mZero, mOne);
      for (int k = -n; k <= degree(); ++k) {
        c.add(coeff(k));
      }
      c.fixDegree();
      return c;
    }
    final Polynomial<E> c = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = n; k > 0; --k) {
      c.add(mZero);
    }
    for (int k = 0; k <= degree(); ++k) {
      c.add(coeff(k));
    }
    c.fixDegree();
    return c;
  }

  /**
   * Get the indeterminate used in this polynomial.
   * @return indeterminate
   */
  public String getIndeterminate() {
    return mIndeterminate;
  }
}
