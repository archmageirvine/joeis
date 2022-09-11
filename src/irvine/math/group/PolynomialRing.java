package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import irvine.math.api.Ring;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A polynomial ring where individuals elements are drawn from a ring.
 * @author Sean A. Irvine
 * @param <E> underlying type of polynomial elements
 */
public class PolynomialRing<E> extends AbstractRing<Polynomial<E>> {
  
  private final Ring<E> mElementRing;
  protected final E mZero;
  protected final E mOne;
  protected final String mIndeterminate;
  private final Polynomial<E> mZeroPolynomial;
  private final Polynomial<E> mOnePolynomial;
  private final Polynomial<E> mXPolynomial;

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param indeterminate the indeterminate symbol
   * @param elementRing ring of underlying elements
   */
  public PolynomialRing(final String indeterminate, final Ring<E> elementRing) {
    mIndeterminate = indeterminate;
    mElementRing = elementRing;
    mZero = mElementRing.zero();
    mOne = mElementRing.one();
    mZeroPolynomial = new Polynomial<>(mIndeterminate, mZero, mOne);
    mOnePolynomial = create(Collections.singletonList(mOne));
    mXPolynomial = create(Arrays.asList(mZero, mOne));
  }

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param elementRing ring of underlying elements
   */
  public PolynomialRing(final Ring<E> elementRing) {
    this("x", elementRing);
  }

  @Override
  public Polynomial<E> one() {
    return mOnePolynomial;
  }

  @Override
  public Polynomial<E> zero() {
    return mZeroPolynomial;
  }

  /**
   * The monic polynomial <code>x</code>.
   * @return the degree 1 polynomial <code>x</code>
   */
  public Polynomial<E> x() {
    return mXPolynomial;
  }

  /**
   * Return an empty polynomial.  Callers can then add values themselves
   * to set a particular polynomial.
   * @return empty polynomial.
   */
  public Polynomial<E> empty() {
    return create(Collections.emptyList());
  }

  /**
   * Create a polynomial in this field with the given coefficients.
   * @param coefficients the coefficients in the underlying field
   * @return the polynomial
   */
  public final Polynomial<E> create(final List<E> coefficients) {
    return new Polynomial<>(mIndeterminate, mElementRing.zero(), mElementRing.one(), coefficients);
  }

  /**
   * Return the polynomial <code>1+a*x^n</code>.
   *
   * @param a coefficient
   * @param n the power
   * @return the polynomial
   * @exception IllegalArgumentException if <code>n</code> is negative
   */
  public Polynomial<E> onePlusXToTheN(final E a, final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      return create(Collections.singletonList(mElementRing.add(a, mOne)));
    }
    final Polynomial<E> p = new Polynomial<>(mIndeterminate, mZero, mOne);
    p.add(mOne);
    for (int k = 1; k < n; ++k) {
      p.add(mZero);
    }
    p.add(a);
    return p;
  }

  /**
   * Return the polynomial <code>1+x^n</code>.
   *
   * @param n the power
   * @return the polynomial
   * @exception IllegalArgumentException if <code>n</code> is negative
   */
  public Polynomial<E> onePlusXToTheN(final int n) {
    return onePlusXToTheN(mOne, n);
  }

  /**
   * Return the polynomial <code>1-a*x^n</code>.
   *
   * @param a coefficient
   * @param n the power
   * @return the polynomial
   * @exception IllegalArgumentException if <code>n</code> is negative
   */
  public Polynomial<E> oneMinusXToTheN(final E a, final int n) {
    if (n <= 0) {
      if (n == 0) {
        return new Polynomial<>(mZero, mOne, Collections.singletonList(mElementRing.subtract(mOne, a)));
      }
      throw new IllegalArgumentException();
    }
    final Polynomial<E> p = new Polynomial<>(mIndeterminate, mZero, mOne);
    p.add(mOne);
    for (int k = 1; k < n; ++k) {
      p.add(mZero);
    }
    p.add(mElementRing.negate(a));
    return p;
  }

  /**
   * Return the polynomial <code>1-x^n</code>.
   *
   * @param n the power
   * @return the polynomial
   * @exception IllegalArgumentException if <code>n</code> is negative
   */
  public Polynomial<E> oneMinusXToTheN(final int n) {
    return oneMinusXToTheN(mOne, n);
  }

  /**
   * Return the polynomial <code>ax^n</code>.
   *
   * @param a coefficient
   * @param n power
   * @return monomial
   * @exception IllegalArgumentException if <code>n</code> is negative.
   * @exception NullPointerException if <code>a</code> is null.
   */
  public Polynomial<E> monomial(final E a, final int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (a == null) {
      throw new NullPointerException();
    }
    final Polynomial<E> p = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = 0; k < n; ++k) {
      p.add(mZero);
    }
    p.add(a);
    return p;
  }

  /**
   * Evaluate the polynomial at the specified point.
   * @param p the polynomial
   * @param x value
   * @return polynomial evaluated at <code>x</code>
   */
  public E eval(final Polynomial<E> p, final E x) {
    if (mZero.equals(x)) {
      return p.isEmpty() ? mZero : p.get(0);
    }
    E t = mOne;
    E r = mZero;
    for (final E c : p) {
      r = mElementRing.add(r, mElementRing.multiply(t, c));
      t = mElementRing.multiply(t, x);
    }
    return r;
  }


  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean isCommutative() {
    return mElementRing.isCommutative();
  }

  @Override
  public boolean isIntegralDomain() {
    return mElementRing.isIntegralDomain();
  }

  @Override
  public boolean contains(final Polynomial<E> a) {
    return a != null;
  }

  @Override
  public Polynomial<E> add(final Polynomial<E> a, final Polynomial<E> b) {
    final Polynomial<E> t = new Polynomial<>(mIndeterminate, mZero, mOne);
    final int degree = Math.max(a.degree(), b.degree());
    for (int k = 0; k <= degree; ++k) {
      t.add(mElementRing.add(a.coeff(k), b.coeff(k)));
    }
    t.fixDegree();
    return t;
  }

  @Override
  public Polynomial<E> negate(final Polynomial<E> a) {
    final Polynomial<E> t = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (final E v : a) {
      t.add(mElementRing.negate(v));
    }
    return t;
  }

  @Override
  public Iterator<Polynomial<E>> iterator() {
    return new Iterator<>() {
      // Generate all degree 0, then all degree 1, and so on
      private final ArrayList<E> mCoeffs = new ArrayList<>();
      private final ArrayList<Iterator<E>> mIterators = new ArrayList<>();

      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public Polynomial<E> next() {
        int k = 0;
        while (true) {
          if (k >= mCoeffs.size()) {
            mIterators.add(mElementRing.iterator());
            if (k > 0) {
              mIterators.get(k).next(); // skip the 0 of the underlying field
            }
            mCoeffs.add(mIterators.get(k).next());
          }
          if (mIterators.get(k).hasNext()) {
            mCoeffs.set(k, mIterators.get(k).next());
            return create(mCoeffs);
          } else {
            mIterators.set(k, mElementRing.iterator());
            mCoeffs.set(k, mIterators.get(k).next());
            ++k;
          }
        }
      }
    };
  }

  @Override
  public Polynomial<E> multiply(final Polynomial<E> a, final Polynomial<E> b) {
    final int d = a.degree();
    final int e = b.degree();
    final Polynomial<E> t = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = d + e; k >= 0; --k) {
      t.add(mZero);
    }
    for (int k = 0; k <= d; ++k) {
      final E ck = a.coeff(k);
      if (!mZero.equals(ck)) {
        for (int j = 0; j <= e; ++j) {
          t.set(k + j, mElementRing.add(t.coeff(k + j), mElementRing.multiply(ck, b.coeff(j))));
        }
      }
    }
    t.fixDegree();
    return t;
  }

  /**
   * Multiply a polynomial by another polynomial and return the resulting
   * polynomial with a limited maximum degree.
   * @param a polynomial to be multiplied
   * @param b polynomial to multiply by
   * @param degreeLimit maximum degree to retain
   * @return product
   */
  public Polynomial<E> multiply(final Polynomial<E> a, final Polynomial<E> b, final int degreeLimit) {
    final int d = a.degree();
    final int e = b.degree();
    final Polynomial<E> t = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = Math.min(d + e, degreeLimit); k >= 0; --k) {
      t.add(mZero);
    }
    final int dlim = Math.min(d, degreeLimit);
    for (int k = 0; k <= dlim; ++k) {
      final E ck = a.coeff(k);
      if (!mZero.equals(ck)) {
        final int elim = Math.min(e, degreeLimit - k);
        for (int j = 0; j <= elim; ++j) {
          final E cj = b.coeff(j);
          if (!mZero.equals(cj)) {
            t.set(k + j, mElementRing.add(t.coeff(k + j), mElementRing.multiply(ck,  cj)));
          }
        }
      }
    }
    t.fixDegree();
    return t;
  }

  /**
   * Compute a polynomial raised to a power discarding all terms greater
   * than the specified degree limit.
   * @param p the polynomial
   * @param n power
   * @param degreeLimit degree limit
   * @return <code>p^n</code>
   */
  public Polynomial<E> pow(final Polynomial<E> p, final int n, final int degreeLimit) {
    if (zero().equals(p)) {
      return n == 0 ? one() : zero();
    }
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    switch (n) {
      case 0:
        return one();
      case 1:
        return p.truncate(degreeLimit);
      case 2:
        return multiply(p, p, degreeLimit);
      case 3:
        return multiply(multiply(p, p, degreeLimit), p, degreeLimit);
      case 4:
        final Polynomial<E> s = multiply(p, p, degreeLimit);
        return multiply(s, s, degreeLimit);
      default:
        final Polynomial<E> u = pow(p, n / 2, degreeLimit);
        final Polynomial<E> t = multiply(u, u, degreeLimit);
        return (n & 1) == 0 ? t : multiply(t, p, degreeLimit);
    }
  }

  /**
   * Compute a polynomial raised to a power discarding all terms greater
   * than the specified degree limit.
   * @param p the polynomial
   * @param n power
   * @param degreeLimit degree limit
   * @return <code>p^n</code>
   */
  public Polynomial<E> powz(final Polynomial<E> p, final Z n, final int degreeLimit) {
    if (n.isZero()) {
      return one();
    } else if (Z.ONE.equals(n)) {
      return p.truncate(degreeLimit);
    } else if (Z.TWO.equals(n)) {
      return multiply(p, p, degreeLimit);
    } else {
      final Polynomial<E> u = powz(p, n.divide2(), degreeLimit);
      final Polynomial<E> t = multiply(u, u, degreeLimit);
      return n.isEven() ? t : multiply(t, p, degreeLimit);
    }
  }

  @Override
  public Polynomial<E> subtract(final Polynomial<E> a, final Polynomial<E> b) {
    final Polynomial<E> t = new Polynomial<>(mIndeterminate, mZero, mOne);
    final int degree = Math.max(a.degree(), b.degree());
    for (int k = 0; k <= degree; ++k) {
      t.add(mElementRing.subtract(a.coeff(k), b.coeff(k)));
    }
    t.fixDegree();
    return t;
  }

  /**
   * Return the polynomial multiplied by the specified value.
   * @param p polynomial
   * @param n multiplicand
   * @return polynomial
   */
  public Polynomial<E> multiply(final Polynomial<E> p, final E n) {
    if (mOne.equals(n)) {
      return p;
    }
    if (mZero.equals(n)) {
      return zero();
    }
    final Polynomial<E> c = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = 0; k < p.size(); ++k) {
      c.add(mElementRing.multiply(p.coeff(k), n));
    }
    c.fixDegree();
    return c;
  }

  /**
   * Return a polynomial multiplied by <code>x^n</code>.  Works for positive,
   * zero, and negative <code>n</code>.
   * @param p polynomial
   * @param n power
   * @return shifted polynomial
   */
  public Polynomial<E> shift(final Polynomial<E> p, final int n) {
    return p.shift(n);
  }

  /**
   * Return the derivative of a polynomial.
   * @param p polynomial to take derivative of
   * @return derivative
   */
  public Polynomial<E> diff(final Polynomial<E> p) {
    final Polynomial<E> t = create(Collections.emptyList());
    E kk = mOne; // tracks k in the coefficient field
    for (int k = 1; k < p.size(); ++k, kk = mElementRing.add(kk, mOne)) {
      final E c = p.get(k);
      t.add(mElementRing.multiply(c, kk));
    }
    return t;
  }

  /**
   * Compute Dedekind eta function for a polynomial out to the specified degree.
   * @param p polynomial
   * @param maxDegree maximum degree of expansion
   * @return eta function
   */
  public Polynomial<E> eta(final Polynomial<E> p, final int maxDegree) {
    if (p.degree() < 1) {
      throw new IllegalArgumentException();
    }
    Polynomial<E> prod = one();
    for (int k = 1; k <= maxDegree; ++k) {
      prod = multiply(prod, subtract(one(), pow(p, k, maxDegree)), maxDegree);
    }
    return prod;
  }

  @Override
  public String toString() {
    return mElementRing + "[" + mIndeterminate + "]";
  }

  @Override
  public Polynomial<E> coerce(final long n) {
    return create(Collections.singletonList(mElementRing.coerce(n)));
  }

  /**
   * Test if the given polynomial is monic.
   * @param p polynomial to test
   * @return true if the polynomial is monic
   */
  public boolean isMonic(final Polynomial<E> p) {
    return p.degree() >= 0 && p.leadingCoeff().equals(mElementRing.one());
  }

  @Override
  public Z characteristic() {
    return mElementRing.characteristic();
  }

  /**
   * Substitute a polynomial for the unknown in another polynomial.
   * @param p polynomial
   * @param v value to substitute
   * @param maxDegree maximum degree term to retain
   * @return substituted polynomial
   */
  public Polynomial<E> substitute(final Polynomial<E> p, final Polynomial<E> v, final int maxDegree) {
    Polynomial<E> res = zero();
    for (int k = 0; k <= p.degree(); ++k) {
      final Polynomial<E> contrib = multiply(pow(v, k, maxDegree), p.coeff(k));
      res = add(res, contrib);
    }
    return res;
  }

  /**
   * Replaces the power series sum of <code>a_n*x^n/n!</code> by sum of <code>a_n*x^n</code>
   * @param p polynomial
   * @return Laplace series
   */
  public Polynomial<E> serlaplace(final Polynomial<E> p) {
    final Polynomial<E> res = empty();
    E f = mOne;
    for (int k = 0; k <= p.degree(); ++k) {
      if (k > 1) {
        f = mElementRing.multiply(f, mElementRing.coerce(k));
      }
      res.add(mElementRing.multiply(p.coeff(k), f));
    }
    return res;
  }

  /**
   * Series convolution or Hadamard product of two polynomials.
   * @param a first polynomial
   * @param b second polynomial
   * @return Hadamard product
   */
  public Polynomial<E> hadamardMultiply(final Polynomial<E> a, final Polynomial<E> b) {
    final Polynomial<E> res = empty();
    for (int k = 0; k <= Math.min(a.degree(), b.degree()); ++k) {
      res.add(mElementRing.multiply(a.coeff(k), b.coeff(k)));
    }
    return res;
  }

  @Override
  public Polynomial<E> coerce(final Z n) {
    return monomial(mElementRing.coerce(n), 0);
  }

  /**
   * Perform a substitution of every variable in the polynomial with the
   * specified power.
   * @param p polynomial
   * @param power substitution power
   * @param maxDegree maximum degree for any variable
   * @param <F> subfield
   * @return deep substitution
   */
  @SuppressWarnings("unchecked")
  public <F> Polynomial<E> deepSubstitute(final Polynomial<E> p, final int power, final int maxDegree) {
    if (!(mElementRing instanceof PolynomialRing<?>)) {
      return p.substitutePower(power, maxDegree);
    }
    // There is an equivalence E == Polynomial<F>
    final PolynomialRing<F> eRing = (PolynomialRing<F>) mElementRing;
    final Polynomial<E> res = empty();
    for (final E c : p) {
      res.add((E) eRing.deepSubstitute((Polynomial<F>) c, power, maxDegree));
    }
    return res.substitutePower(power, maxDegree);
  }

  /**
   * Perform a substitution of every variable in the polynomial with the
   * specified power.
   * @param p polynomial
   * @param power substitution power
   * @return deep substitution
   */
  public Polynomial<E> deepSubstitute(final Polynomial<E> p, final int power) {
    return deepSubstitute(p, power, Integer.MAX_VALUE);
  }

  /**
   * Remove all terms of degree lower than specified from the polynomial.
   * Corresponds with Pari <code>serchop</code>
   * @param p polynomial
   * @param degree degree limit
   * @return polynomial with low degree terms removed.
   */
  public Polynomial<E> leftTruncate(final Polynomial<E> p, final int degree) {
    if (degree > p.degree()) {
      return zero();
    }
    final Polynomial<E> res = empty();
    for (int k = 0; k < degree; ++k) {
      res.add(mZero);
    }
    res.addAll(p.subList(degree, p.size()));
    return res;
  }
}
