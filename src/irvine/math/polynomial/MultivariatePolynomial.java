package irvine.math.polynomial;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.api.Field;
import irvine.math.group.PolynomialRing;
import irvine.math.z.Z;

/**
 * Represent an immutable integer multivariate polynomial.
 * @param <E> underlying coefficient type
 * @author Sean A. Irvine
 */
public final class MultivariatePolynomial<E> extends HashMap<MultivariatePolynomial.Term, E> {

  private static final int[][] EMPTY_TERMS = new int[0][];

  /**
   * Represent a single term in a multivariate polynomial.
   */
  public static class Term implements Comparable<Term> {

    private final int[] mPowers;

    /**
     * Construct a term for a multivariate polynomial.
     * @param powers power of each variable
     */
    public Term(final int[] powers) {
      mPowers = Arrays.copyOf(powers, powers.length);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mPowers);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Term && Arrays.equals(mPowers, ((Term) obj).mPowers);
    }

    @Override
    public int compareTo(final Term that) {
      for (int k = 0; k < mPowers.length; ++k) {
        if (mPowers[k] > that.mPowers[k]) {
          return 1;
        } else if (mPowers[k] < that.mPowers[k]) {
          return -1;
        }
      }
      return 0;
    }

    /**
     * Return the power of the specified variable in this term.
     * @param i variable index
     * @return power
     */
    public int get(final int i) {
      return mPowers[i];
    }
  }

  /**
   * Construct the multivariate polynomial 1 in specified number of variables.
   * @param coefficientField underlying coefficient field.
   * @param variables number of variables
   * @return 1
   */
  public static <E> MultivariatePolynomial<E> one(final Field<E> coefficientField, final int variables) {
    return new MultivariatePolynomial<>(coefficientField, variables, new int[][] {new int[variables]}, Collections.singletonList(coefficientField.one()));
  }

  /**
   * Create a multivariate polynomial from an ordinary polynomial.
   *
   * @param coefficientField field for coefficients
   * @param poly polynomial
   * @param index index of variable to use for this polynomial
   * @param variables number of variables
   * @return number of variables in multivariate polynomial
   */
  public static <E> MultivariatePolynomial<E> create(final Field<E> coefficientField, final Polynomial<E> poly, final int index, final int variables) {
    final MultivariatePolynomial<E> mp = new MultivariatePolynomial<>(coefficientField, variables);
    final int[] powers = new int[variables];
    for (int k = 0; k <= poly.degree(); ++k) {
      powers[index] = k;
      mp.add(new Term(powers), poly.coeff(k));
    }
    return mp;
  }

  private final Field<E> mCoefficientField;
  private final int mVariables;

  /**
   * Construct a new multivariate polynomial with specified coefficients. The supplied
   * terms and coefficient arrays must have the same length.
   * @param coefficientField field for coefficients
   * @param variables number of variables
   * @param terms powers for variables
   * @param coeffs coefficients for variables
   */
  public MultivariatePolynomial(final Field<E> coefficientField, final int variables, final int[][] terms, final List<E> coeffs) {
    if (coefficientField == null || coeffs == null || terms == null) {
      throw new NullPointerException();
    }
    if (variables < 0) {
      throw new IllegalArgumentException();
    }
    if (terms.length != coeffs.size()) {
      throw new IllegalArgumentException();
    }
    mCoefficientField = coefficientField;
    mVariables = variables;
    for (int k = 0; k < terms.length; ++k) {
      if (put(new Term(terms[k]), coeffs.get(k)) != null) {
        throw new IllegalArgumentException();
      }
    }
  }

  /**
   * Construct a new multivariate polynomial with specified coefficients.
   * @param coefficientField field of coefficients
   * @param variables number of variables
   */
  public MultivariatePolynomial(final Field<E> coefficientField, final int variables) {
    this(coefficientField, variables, EMPTY_TERMS, Collections.emptyList());
  }

  private void checkVariables(final MultivariatePolynomial<?> p) {
    if (p.mVariables != mVariables) {
      throw new IllegalArgumentException();
    }
  }

  private void add(final Term t, final E c) {
    final E ex = remove(t);
    final E v = ex == null ? c : mCoefficientField.add(ex, c);
    if (!mCoefficientField.zero().equals(v)) {
      put(t, v);
    }
  }

  /**
   * Add this polynomial to another.
   * @param p the other polynomial
   * @return the sum
   */
  public MultivariatePolynomial<E> add(final MultivariatePolynomial<E> p) {
    checkVariables(p);
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables);
    res.putAll(this);
    for (final Map.Entry<Term, E> e : p.entrySet()) {
      final Term term = e.getKey();
      if (res.containsKey(term)) {
        final E v = mCoefficientField.add(e.getValue(), res.get(term));
        if (mCoefficientField.zero().equals(v)) {
          res.remove(term);
        } else {
          res.put(term, v);
        }
      } else {
        res.put(term, e.getValue());
      }
    }
    return res;
  }

  private boolean hasZero(final int[] powers) {
    for (final int p : powers) {
      if (p == 0) {
        return true;
      }
    }
    return false;
  }

  /**
   * Substitute powers of variables.
   * @param powers powers for each variable
   * @param degreeLimits degree limits for each variable
   * @return substituted polynomial
   */
  public MultivariatePolynomial<E> substitutePowers(final int[] powers, final int[] degreeLimits) {
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables);
    if (hasZero(powers)) {
      // Extra care is needed in this case because some terms can coalesce
      for (final Map.Entry<Term, E> e : entrySet()) {
        final Term term = e.getKey();
        final int[] sterm = new int[term.mPowers.length];
        boolean ok = true;
        for (int k = 0; k < sterm.length; ++k) {
          sterm[k] = term.mPowers[k] * powers[k];
          if (sterm[k] > degreeLimits[k]) {
            ok = false;
            break;
          }
        }
        if (ok) {
          final Term t = new Term(sterm);
          final E v = res.get(t);
          res.put(t, v == null ? e.getValue() : mCoefficientField.add(v, e.getValue()));
        }
      }
    } else {
      for (final Map.Entry<Term, E> e : entrySet()) {
        final Term term = e.getKey();
        final int[] sterm = new int[term.mPowers.length];
        boolean ok = true;
        for (int k = 0; k < sterm.length; ++k) {
          sterm[k] = term.mPowers[k] * powers[k];
          if (sterm[k] > degreeLimits[k]) {
            ok = false;
            break;
          }
        }
        if (ok) {
          res.put(new Term(sterm), e.getValue());
        }
      }
    }
    return res;
  }

  /**
   * Substitute powers of variables.
   * @param powers powers for each variable
   * @return substituted polynomial
   */
  public MultivariatePolynomial<E> substitutePowers(final int[] powers) {
    final int[] limits = new int[powers.length];
    Arrays.fill(limits, Integer.MAX_VALUE);
    return substitutePowers(powers, limits);
  }

  /**
   * Evaluate with the specified values for variables.
   * @param args values
   * @return evaluation
   */
  @SafeVarargs
  public final E eval(final E... args) {
    E sum = mCoefficientField.zero();
    for (final Map.Entry<Term, E> e : entrySet()) {
      E v = e.getValue();
      final int[] p = e.getKey().mPowers;
      for (int k = 0; k < p.length; ++k) {
        v = mCoefficientField.multiply(v, mCoefficientField.pow(args[k], p[k]));
      }
      sum = mCoefficientField.add(sum, v);
    }
    return sum;
  }

  /**
   * Substitute a particular variable with a particular value.  The resulting polynomial
   * will be the same type as the given polynomial (although there will no longer be
   * any terms containing the specified variable number).
   * @param var variable number
   * @param value value
   * @return substituted polynomial
   */
  public MultivariatePolynomial<E> subs(final int var, final E value) {
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables);
    for (final Map.Entry<Term, E> e : entrySet()) {
      E v = e.getValue();
      final int[] p = e.getKey().mPowers;
      final int exponent = p[var];
      final E newCoeff = mCoefficientField.multiply(v, mCoefficientField.pow(value, exponent));
      final int[] pattern = Arrays.copyOf(p, p.length);
      pattern[var] = 0;
      final Term term = new Term(pattern);
      final E existing = res.get(term);
      res.put(term, existing == null ? newCoeff : mCoefficientField.add(existing, newCoeff));
    }
    return res;
  }

  /**
   * Multiply this polynomial by another.
   * @param p the other polynomial
   * @param degreeLimits maximum retained degree for each variable
   * @return the product
   * @throws IllegalArgumentException if the number of variables don't match
   */
  public MultivariatePolynomial<E> multiply(final MultivariatePolynomial<E> p, final int[] degreeLimits) {
    checkVariables(p);
    if (degreeLimits.length != mVariables) {
      throw new IllegalArgumentException();
    }
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables);
    for (final Map.Entry<Term, E> e : p.entrySet()) {
      for (final Map.Entry<Term, E> f : entrySet()) {
        final int[] u = new int[mVariables];
        boolean overDegree = false;
        for (int k = 0; k < mVariables; ++k) {
          u[k] = e.getKey().mPowers[k] + f.getKey().mPowers[k];
          overDegree |= u[k] > degreeLimits[k];
        }
        if (!overDegree) {
          res.add(new Term(u), mCoefficientField.multiply(e.getValue(), f.getValue()));
        }
      }
    }
    return res;
  }

  /**
   * Multiply this polynomial by another.
   * @param p the other polynomial
   * @return the product
   */
  public MultivariatePolynomial<E> multiply(final MultivariatePolynomial<E> p) {
    //System.out.println("Doing: (" + this + ") * (" + p + ")");
    checkVariables(p);
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables);
    for (final Map.Entry<Term, E> e : p.entrySet()) {
      for (final Map.Entry<Term, E> f : entrySet()) {
        final int[] u = new int[mVariables];
        for (int k = 0; k < mVariables; ++k) {
          u[k] = e.getKey().mPowers[k] + f.getKey().mPowers[k];
        }
        res.add(new Term(u), mCoefficientField.multiply(e.getValue(), f.getValue()));
      }
    }
    return res;
  }

  /**
   * Multiply this polynomial by a number.
   * @param n number to multiply by
   * @return product
   */
  public MultivariatePolynomial<E> scalarMultiply(final E n) {
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables);
    for (final Map.Entry<Term, E> f : entrySet()) {
      res.add(f.getKey(), mCoefficientField.multiply(f.getValue(), n));
    }
    return res;
  }

  /**
   * Divide this polynomial by a number.
   * @param n number to divide by
   * @return product
   */
  public MultivariatePolynomial<E> scalarDivide(final E n) {
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables);
    for (final Map.Entry<Term, E> f : entrySet()) {
      res.add(f.getKey(), mCoefficientField.divide(f.getValue(), n));
    }
    return res;
  }

  /**
   * Test if this is the zero polynomial.
   * @return true for zero
   */
  public boolean isZero() {
    return isEmpty();
  }

  /**
   * The number of variables in this polynomial.
   * @return number of variables
   */
  public int numberVariables() {
    return mVariables;
  }

  /**
   * If this is a single variable polynomial convert it to polynomial type.
   * @return polynomial
   */
  public Polynomial<E> toPolynomial() {
    if (mVariables != 1) {
      throw new IllegalArgumentException();
    }
    // Find largest power
    int max = 0;
    for (final Term t : keySet()) {
      if (t.mPowers[0] > max) {
        max = t.mPowers[0];
      }
    }
    @SuppressWarnings("unchecked")
    final E[] c = (E[]) new Object[max + 1];
    Arrays.fill(c, Z.ZERO);
    for (final Map.Entry<Term, E> e : entrySet()) {
      c[e.getKey().mPowers[0]] = e.getValue();
    }
    return new PolynomialRing<>(mCoefficientField).create(Arrays.asList(c));
  }

  /**
   * Extract a polynomial with one less variable comprising those terms containing
   * <code>varNumber^power</code>.  This is kind of like a polynomial coefficient.
   * @param varNumber variable number
   * @param power power of that variable
   * @return polynomial with one less variable
   */
  public MultivariatePolynomial<E> extract(final int varNumber, final int power) {
    if (varNumber < 0 || varNumber >= mVariables) {
      throw new IllegalArgumentException();
    }
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mVariables - 1);
    for (final Map.Entry<Term, E> e : entrySet()) {
      final Term t = e.getKey();
      final int[] powers = t.mPowers;
      if (powers[varNumber] == power) {
        final int[] r = new int[res.mVariables];
        for (int j = 0, k = 0; k < mVariables; ++k) {
          if (k != varNumber) {
            r[j++] = powers[k];
          }
        }
        res.add(new Term(r), e.getValue());
      }
    }
    return res;
  }

  /**
   * Degree of the polynomial in a particular variable.
   * @param varNumber variable
   * @return degree of polynomial in this variable
   */
  public int degree(final int varNumber) {
    int d = 0;
    for (final Term t : keySet()) {
      if (t.mPowers[varNumber] > d) {
        d = t.mPowers[varNumber];
      }
    }
    return d;
  }

  private static final String VARNAMES = "xyzuvwrstabcdefghijklmnopq";

  private boolean constantTerm(final int[] p) {
    for (int v : p) {
      if (v != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    if (isZero()) {
      return "0";
    }
    if (mVariables > VARNAMES.length()) {
      return super.toString();
    }
    final StringBuilder sb = new StringBuilder();
    // Want to print terms in a sensible order
    final Term[] terms = keySet().toArray(new Term[size()]);
    Arrays.sort(terms);
    for (final Term t : terms) {
      final E v = get(t);
      assert !mCoefficientField.zero().equals(v);
      if (v.toString().charAt(0) != '-' && sb.length() != 0) {
        sb.append('+');
      }
      final int[] p = t.mPowers;
      if (Z.NEG_ONE.equals(v)) {
        sb.append(constantTerm(p) ? "-1" : "-");
      } else if (!Z.ONE.equals(v) || constantTerm(p)) {
        sb.append(v);
      }
      for (int k = 0; k < mVariables; ++k) {
        if (p[k] != 0) {
          sb.append(VARNAMES.charAt(k));
          if (p[k] != 1) {
            sb.append('^').append(p[k]);
          }
        }
      }
    }
    return sb.toString();
  }
}
