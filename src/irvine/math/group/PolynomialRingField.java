package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import irvine.math.api.Field;
import irvine.math.api.Group;
import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Discriminant;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A polynomial where individuals elements are drawn from a field.
 * @author Sean A. Irvine
 * @param <E> underlying type of polynomial elements
 */
public class PolynomialRingField<E> extends PolynomialRing<E> implements Field<Polynomial<E>> {

  private final Field<E> mElementField;

  /**
   * Construct a new polynomial field.
   * @param indeterminate the indeterminate for the field
   * @param elementField field of underlying elements
   */
  public PolynomialRingField(final String indeterminate, final Field<E> elementField) {
    super(indeterminate, elementField);
    mElementField = elementField;
  }

  /**
   * Construct a new polynomial field.
   * @param elementField field of underlying elements
   */
  public PolynomialRingField(final Field<E> elementField) {
    this("x", elementField);
  }

  /**
   * Get the field of the polynomial coefficients.
   * @return coefficient field
   */
  public Field<E> coefficientField() {
    return mElementField;
  }

  /**
   * Return the polynomial divided by the specified value.
   * @param p polynomial
   * @param n dividend
   * @return polynomial
   */
  public Polynomial<E> divide(final Polynomial<E> p, final E n) {
    if (mOne.equals(n)) {
      return p;
    }
    final Polynomial<E> c = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = 0; k < p.size(); ++k) {
      c.add(mElementField.divide(p.coeff(k), n));
    }
    return c;
  }

  /**
   * Return the formal indefinite integral of a polynomial.
   * @param p the polynomial to integrate
   * @return integral
   */
  public Polynomial<E> integrate(final Polynomial<E> p) {
    final Polynomial<E> t = empty();
    t.add(mZero);
    E kk = mOne;
    for (int k = 0; k < p.size(); ++k, kk = mElementField.add(kk, mOne)) {
      t.add(mElementField.divide(p.get(k), kk));
    }
    return t;
  }

  /**
   * Given the polynomial <code>y=x(1+a_1x+a_2x^2+...)</code> determines
   * coefficients <code>b_i</code> such that <code>x=y(1+b_1y+b_2y^2+...)</code>.
   * @param t the polynomial in <code>x</code>
   * @param degree degree to limit expansion to
   * @return the reversion polynomial
   * @throws IllegalArgumentException if the polynomial is not of the correct form.
   */
  public Polynomial<E> reversion(final Polynomial<E> t, final int degree) {
    // Lagrangian power series reversion, based on Knuth, Algorithm L in The Art of Computer Programming, Seminumerical Algorithms
    if (!mElementField.zero().equals(t.coeff(0))) {
      throw new IllegalArgumentException("Expected " + mElementField.zero() + " saw " + t.coeff(0));
    }
    if (t.degree() > 0 && !mElementField.one().equals(t.coeff(1))) {
      // Cf. A123301 for a version that supports non-unit t.coeff(1)
      throw new IllegalArgumentException("Expected " + mElementField.one() + " saw " + t.coeff(1));
    }
    final ArrayList<E> u = new ArrayList<>();
    final Polynomial<E> w = empty();
    u.add(mOne);
    w.add(mZero);
    w.add(mOne);
    for (int n = 2; n <= degree; ++n) {
      for (int k = 1; k <= n - 2; ++k) {
        E uk = mZero;
        for (int j = 2; j <= k + 1; ++j) {
          uk = mElementField.add(uk, mElementField.multiply(u.get(k + 1 - j), t.coeff(j)));
        }
        u.set(k, mElementField.subtract(u.get(k), uk));
      }
      E un = mZero;
      E jj = mOne;  // jj tracks j but in field elements
      for (int j = 2; j <= n; ++j) {
        jj = mElementField.add(jj, mOne);
        un = mElementField.subtract(un, mElementField.multiply(mElementField.multiply(u.get(n - j), t.coeff(j)), jj));
      }
      u.add(un);
      assert u.size() == n;
      w.add(mElementField.divide(un, jj));  // i.e. /n (since jj=n)
    }
    return w;
  }

  /**
   * Compute powers to arbitrary field elements. May not work in all cases.
   * @param a base polynomial
   * @param power field exponent
   * @param n degree limit
   * @return <code>a^power</code> up to degree <code>n</code>
   */
  public Polynomial<E> pow(final Polynomial<E> a, final E power, final int n) {
    // NOTE: This method is flakey.  It appears to work in some circumstances
    // but can give wrong answers for integers, and non-monic rationals
    if (mOne.equals(power)) {
      return a.truncate(n);
    }
    final ArrayList<E> b = new ArrayList<>();
    b.add(mOne);
    E kk = mZero;
    for (int k = 1; k <= n; ++k) {
      kk = mElementField.add(kk, mOne);
      E bk = mZero;
      E jj = mZero;
      for (int j = 0; j < k; ++j, jj = mElementField.add(jj, mOne)) {
        final E d = mElementField.multiply(power, mElementField.subtract(kk, jj));
        final E t = mElementField.multiply(mElementField.multiply(a.coeff(k - j), b.get(j)), mElementField.subtract(d, jj));
        bk = mElementField.add(bk, t);
      }
      b.add(mElementField.divide(bk, kk));
    }
    return create(b);
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private Polynomial<E>[] makeDivisionResult(final Polynomial<E> q, final Polynomial<E> r) {
    return (Polynomial<E>[]) new Polynomial[] {q, r};
  }

  /**
   * Divide one polynomial by another returning a quotient and remainder, such that
   * the degree of the remainder is strictly less than the degree of the denominator.
   * @param num numerator
   * @param den denominator
   * @return quotient and remainder
   */
  public Polynomial<E>[] divideAndRemainder(final Polynomial<E> num, final Polynomial<E> den) {
    if (zero().equals(den)) {
      throw new ArithmeticException();
    }
    if (zero().equals(num)) {
      return makeDivisionResult(zero(), zero());
    }
    if (one().equals(den)) {
      return makeDivisionResult(num, zero());
    }
    Polynomial<E> f = num;
    Polynomial<E> q = zero();
    final E leadCoeff = den.coeff(den.degree());
    while (f.degree() >= den.degree()) {
      final int degreeDelta = f.degree() - den.degree();
      final Polynomial<E> t = monomial(mElementField.divide(f.coeff(f.degree()), leadCoeff), degreeDelta);
      q = add(q, t);
      f = subtract(f, multiply(t, den));
    }
    return makeDivisionResult(q, f);
  }

  /**
   * One polynomial modulo another.  Equivalent to <code>divideAndRemainder(num, den)[1]</code>.
   * @param num numerator
   * @param den denominator
   * @return modulus
   */
  public Polynomial<E> mod(final Polynomial<E> num, final Polynomial<E> den) {
    if (zero().equals(den)) {
      throw new ArithmeticException();
    }
    if (zero().equals(num) || one().equals(den)) {
      return zero();
    }
    Polynomial<E> f = num;
    final E leadCoeff = den.coeff(den.degree());
    while (f.degree() >= den.degree()) {
      final int degreeDelta = f.degree() - den.degree();
      final Polynomial<E> t = monomial(mElementField.divide(f.coeff(f.degree()), leadCoeff), degreeDelta);
      f = subtract(f, multiply(t, den));
    }
    return f;
  }

  /**
   * Construct the series expansion of the ratio of two polynomials.
   * @param num numerator
   * @param den denominator
   * @param degree degree to extend series to
   * @return the resulting polynomial series
   * @throws ArithmeticException if <code>den=0</code>.
   */
  public Polynomial<E> series(final Polynomial<E> num, final Polynomial<E> den, final int degree) {
    if (zero().equals(den)) {
      throw new ArithmeticException();
    }
    // Find the smallest degree non-zero coefficient in denominator.
    // Such a coefficient must exist because den != 0
    int offset = 0;
    while (mZero.equals(den.coeff(offset))) {
      ++offset;
    }
    final E d = den.coeff(offset);
    final ArrayList<E> a = new ArrayList<>();
    for (int k = 0; k <= degree; ++k) {
      E s = num.coeff(k + offset);
      for (int j = 0; j < k; ++j) {
        s = mElementField.subtract(s, mElementField.multiply(a.get(j), den.coeff(k + offset - j)));
      }
      a.add(mElementField.divide(s, d));
    }
    return create(a);
  }

  /**
   * Return a coefficient in the series expansion of the ratio of two polynomials.
   * @param num numerator
   * @param den denominator
   * @param coeff coefficient to retrieve
   * @return the coefficient
   * @throws ArithmeticException if <code>den=0</code>.
   */
  public E coeff(final Polynomial<E> num, final Polynomial<E> den, final int coeff) {
    return series(num, den, coeff).coeff(coeff);
  }

  /**
   * Perform the inversion or <code>AIK</code> transform of the input
   * polynomial, expanding to the specified number of terms. The
   * resulting polynomial is <code>A(x)/(1-A(x))</code>.
   * @param p the polynomial
   * @param n maximum degree
   * @return transformed polynomial.
   */
  public Polynomial<E> invert(final Polynomial<E> p, final int n) {
    return series(p, subtract(one(), p), n);
  }

  /**
   * Series expansion of <code>exp(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>exp(p)</code>.
   */
  public Polynomial<E> exp(final Polynomial<E> p, final int n) {
    final RingFactorial<E> f = RingFactorial.instance(mElementField);
    Polynomial<E> s = one();
    if (!zero().equals(p)) {
      for (int k = 1; k <= n; ++k) {
        s = add(s, divide(pow(p, k, n), f.factorial(k)));
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>log(1+p)</code> to specified number of terms.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>log(1+p)</code>.
   */
  public Polynomial<E> log1p(final Polynomial<E> p, final int n) {
    Polynomial<E> s = zero();
    if (!zero().equals(p)) {
      E kk = mOne; // Tracks k in the field
      for (int k = 1; k <= n; ++k, kk = mElementField.add(kk, mOne)) {
        s = signedAdd((k & 1) == 1, s, divide(pow(p, k, n), kk));
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>log(p)</code> to specified number of terms.
   * @param p polynomial (assumed to have leading coefficient of 1)
   * @param n maximum degree
   * @return series for <code>log(p)</code>.
   */
  public Polynomial<E> log(final Polynomial<E> p, final int n) {
    return log1p(subtract(p, one()), n);
  }

  /**
   * Series expansion of <code>sin(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>sin(p)</code>
   */
  public Polynomial<E> sin(final Polynomial<E> p, final int n) {
    final RingFactorial<E> f = RingFactorial.instance(mElementField);
    Polynomial<E> s = zero();
    if (!zero().equals(p)) {
      for (int k = 1; k <= n; k += 2) {
        final Polynomial<E> u = divide(pow(p, k, n), f.factorial(k));
        s = signedAdd((k & 2) == 0, s, u);
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>cos(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>cos(p)</code>
   */
  public Polynomial<E> cos(final Polynomial<E> p, final int n) {
    if (zero().equals(p) || n <= 0) {
      return one();
    }
    final RingFactorial<E> f = RingFactorial.instance(mElementField);
    Polynomial<E> s = zero();
    for (int k = 0; k <= n; k += 2) {
      final Polynomial<E> u = divide(pow(p, k, n), f.factorial(k));
      s = signedAdd((k & 2) == 0, s, u);
    }
    return s;
  }

  /**
   * Series expansion of <code>tan(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>tan(p)</code>
   */
  public Polynomial<E> tan(final Polynomial<E> p, final int n) {
    return n <= 1 ? p : series(sin(p, n), cos(p, n), n);
  }

  /**
   * Series expansion of <code>sec(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>sec(p)</code>
   */
  public Polynomial<E> sec(final Polynomial<E> p, final int n) {
    return series(one(), cos(p, n), n);
  }

  /**
   * Series expansion of <code>x * cot(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>x * cot(p)</code>
   */
  public Polynomial<E> xcot(final Polynomial<E> p, final int n) {
    return n == 1 ? zero() : series(x(), tan(p, n + 1), n + 1);
  }

  /**
   * Series expansion of <code>x * csc(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>x * csc(p)</code>
   */
  public Polynomial<E> xcsc(final Polynomial<E> p, final int n) {
    return n == 1 ? zero() : series(x(), sin(p, n + 1), n + 1);
  }

  /**
   * Series expansion of <code>asin(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>asin(p)</code>
   */
  public Polynomial<E> asin(final Polynomial<E> p, final int n) {
    Polynomial<E> sum = zero();
    if (!zero().equals(p)) {
      final E two = mElementField.add(mOne, mOne);
      E c = mOne;
      E k2 = mZero;
      for (int k = 1; k <= n; k += 2) {
        final Polynomial<E> u = multiply(pow(p, k, n), mElementField.divide(c, mElementField.add(k2, mOne)));
        sum = add(sum, u);
        k2 = mElementField.add(k2, two);
        c = mElementField.divide(mElementField.multiply(c, mElementField.subtract(k2, mOne)), k2);
      }
    }
    return sum;
  }

  /**
   * Series expansion of <code>atan(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>atan(p)</code>
   */
  public Polynomial<E> atan(final Polynomial<E> p, final int n) {
    Polynomial<E> sum = zero();
    if (!zero().equals(p)) {
      final E two = mElementField.add(mOne, mOne);
      E c = mOne;
      E k2 = mZero;
      for (int k = 1; k <= n; k += 2) {
        final Polynomial<E> u = multiply(pow(p, k, n), mElementField.divide(c, mElementField.add(k2, mOne)));
        sum = add(sum, u);
        k2 = mElementField.add(k2, two);
        c = mElementField.negate(c);
      }
    }
    return sum;
  }

  /**
   * Series expansion of <code>sinh(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>sinh(p)</code>.
   */
  public Polynomial<E> sinh(final Polynomial<E> p, final int n) {
    final RingFactorial<E> f = RingFactorial.instance(mElementField);
    Polynomial<E> s = zero();
    if (!zero().equals(p)) {
      for (int k = 1; k <= n; k += 2) {
        s = add(s, divide(pow(p, k, n), f.factorial(k)));
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>cosh(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>cosh(p)</code>.
   */
  public Polynomial<E> cosh(final Polynomial<E> p, final int n) {
    final RingFactorial<E> f = RingFactorial.instance(mElementField);
    Polynomial<E> s = one();
    if (!zero().equals(p)) {
      for (int k = 2; k <= n; k += 2) {
        s = add(s, divide(pow(p, k, n), f.factorial(k)));
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>tanh(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>tanh(p)</code>
   */
  public Polynomial<E> tanh(final Polynomial<E> p, final int n) {
    return zero().equals(p) || n <= 0 ? one() : series(sinh(p, n), cosh(p, n), n);
  }

  /**
   * Series expansion of <code>sech(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>sech(p)</code>
   */
  public Polynomial<E> sech(final Polynomial<E> p, final int n) {
    return n == 1 ? one() : series(one(), cosh(p, n), n);
  }

  /**
   * Series expansion of <code>x * csch(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>x * csch(p)</code>
   */
  public Polynomial<E> xcsch(final Polynomial<E> p, final int n) {
    return n == 1 ? zero() : series(x(), sinh(p, n + 1), n + 1);
  }

  /**
   * Series expansion of <code>x * coth(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>x * coth(p)</code>
   */
  public Polynomial<E> xcoth(final Polynomial<E> p, final int n) {
    return series(x(), tanh(p, n + 1), n + 1);
  }

  /**
   * Series expansion of <code>asinh(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>asinh(p)</code>
   */
  public Polynomial<E> asinh(final Polynomial<E> p, final int n) {
    Polynomial<E> sum = zero();
    if (!zero().equals(p)) {
      final E two = mElementField.add(mOne, mOne);
      E c = mOne;
      E k2 = mZero;
      for (int k = 1; k <= n; k += 2) {
        final Polynomial<E> u = multiply(pow(p, k, n), mElementField.divide(c, mElementField.add(k2, mOne)));
        sum = add(sum, u);
        k2 = mElementField.add(k2, two);
        c = mElementField.negate(mElementField.divide(mElementField.multiply(c, mElementField.subtract(k2, mOne)), k2));
      }
    }
    return sum;
  }

  /**
   * Series expansion of <code>acosh(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>acosh(p)</code>
   */
  public Polynomial<E> acosh(final Polynomial<E> p, final int n) {
    // This might not work properly in all circumstances
    if (n <= 1) {
      return p;
    }
    // acosh(x) = ln(x + sqrt(x^2-1))
    return log(add(p, sqrt(subtract(pow(p, 2, n + 2), one()), n)), n);
  }

  /**
   * Series expansion of <code>atan(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>atan(p)</code>
   */
  public Polynomial<E> atanh(final Polynomial<E> p, final int n) {
    Polynomial<E> sum = zero();
    if (!zero().equals(p)) {
      final E two = mElementField.add(mOne, mOne);
      E k2 = mZero;
      for (int k = 1; k <= n; k += 2) {
        final Polynomial<E> u = multiply(pow(p, k, n), mElementField.divide(mOne, mElementField.add(k2, mOne)));
        sum = add(sum, u);
        k2 = mElementField.add(k2, two);
      }
    }
    return sum;
  }

  /**
   * Series expansion of the Lambert W function to specified degree.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>LambertW(p)</code>.
   */
  public Polynomial<E> lambertW(final Polynomial<E> p, final int n) {
    final RingFactorial<E> f = RingFactorial.instance(mElementField);
    Polynomial<E> s = zero();
    if (!zero().equals(p)) {
      for (int k = 1; k <= n; ++k) {
        s = signedAdd((k & 1) == 1, s, divide(multiply(pow(p, k, n), mElementField.pow(mElementField.coerce(k), k - 1)), f.factorial(k)));
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>sqrt(1+p)</code> to specified number of terms.
   * Does not work for integers.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>sqrt(1+p)</code>.
   */
  @SuppressWarnings("unchecked")
  public Polynomial<E> sqrt1p(final Polynomial<E> p, final int n) {
    // In rationals sqrt(1+x) = 1 + (1/2)x - (1/2)(1/4)x^2 + (1/2)(1/4)(3/6)x^3 - (1/2)(1/4)(3/6)(5/8)x^4 + ...

    // This algorithm does not work well for integers -- in fact, it is likely to go into infinite loop.
    // The following special cases attempt to circumvent this limitation by promoting up to the rationals
    // doing the square root and reverting to integers.
    if (mElementField instanceof Integers) {
      // Try and make it work for Z[x] ...
      return (Polynomial<E>) PolynomialUtils.qToZ(PolynomialUtils.QX.sqrt1p(PolynomialUtils.zToQ((Polynomial<Z>) p), n));
    }
    if (mElementField instanceof PolynomialRingField<?> && ((PolynomialRingField<?>) mElementField).mElementField instanceof Integers) {
      // Try to make it work for Z[x,y] ...
      return (Polynomial<E>) PolynomialUtils.qxToZx(PolynomialUtils.QXX.sqrt1p(PolynomialUtils.zxToQx((Polynomial<Polynomial<Z>>) p), n));
    }

    Polynomial<E> s = one();
    if (!zero().equals(p)) {
      E coeff = mOne;
      E kEven = mZero;
      E kOdd = mOne;
      for (int k = 1; k <= n; ++k) {
        coeff = mElementField.multiply(coeff, kOdd);
        kOdd = mElementField.add(kEven, mOne);
        kEven = mElementField.add(kOdd, mOne);
        coeff = mElementField.divide(coeff, kEven); // This doesn't work in Z
        final Polynomial<E> t = multiply(pow(p, k, n), coeff);
        s = signedAdd((k & 1) == 1, s, t);
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>sqrt(1-p)</code> to specified number of terms.
   * @param p polynomial
   * @param n maximum degree
   * @return series for <code>sqrt(1-p)</code>.
   */
  public Polynomial<E> sqrt1m(final Polynomial<E> p, final int n) {
    return sqrt1p(negate(p), n);
  }

  /**
   * Series expansion of <code>sqrt(p)</code> to specified number of terms.
   * @param p polynomial
   * @param n maximum degree (may sometimes exceed this)
   * @return series for <code>sqrt(1-p)</code>.
   */
  public Polynomial<E> sqrt(final Polynomial<E> p, final int n) {
    // Make sure the lowest non-zero coefficient is an even power
    int m = 0;
    while (mElementField.zero().equals(p.coeff(m))) {
      ++m;
    }
    if ((m & 1) != 0 || !mElementField.one().equals(p.coeff(m))) {
      throw new UnsupportedOperationException(p.toString());
    }
    // sqrt(x^m * f(x)) m even is x^(m/2) * sqrt(f(x))
    return sqrt1p(subtract(p.shift(-m), one()), n).shift(m / 2);
  }

  /**
   * Return the discriminant of a polynomial.
   * @param p polynomial
   * @return the discriminant
   */
  public E discriminant(final Polynomial<E> p) {
    return Discriminant.discriminant(this, p);
  }

  @Override
  public Polynomial<E> inverse(final Polynomial<E> element) {
    return divideAndRemainder(one(), element)[0];
  }

  @Override
  public Polynomial<E> divide(final Polynomial<E> n, final Polynomial<E> d) {
    return divideAndRemainder(n, d)[0];
  }

  @Override
  public Group<Polynomial<E>> multiplicativeGroup() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isIntegralDomain() {
    return true;
  }

  /**
   * Apply the Lagrange interpolation formula to the supplied tuples,
   * generating a polynomial passing through all the tuples.
   * @param tuples points
   * @return polynomial
   */
  public Polynomial<E> lagrange(final Map<E, E> tuples) {
    Polynomial<E> sum = zero();
    for (final Map.Entry<E, E> e : tuples.entrySet()) {
      final E a = e.getKey();
      final E b = e.getValue();
      Polynomial<E> p = one();
      E den = mElementField.one();
      for (final E c : tuples.keySet()) {
        if (c != a) {
          p = multiply(p, create(Arrays.asList(mElementField.negate(c), mElementField.one())));
          den = mElementField.multiply(den, mElementField.subtract(a, c));
        }
      }
      sum = add(sum, multiply(p, mElementField.divide(b, den)));
    }
    return sum;
  }

  /**
   * Return the monic associate of the given polynomial.  That is,
   * return polynomial <code>p</code>, divided through by its leading
   * coefficient.
   * @param p the polynomial
   * @return monic associate
   */
  public Polynomial<E> monicAssociate(final Polynomial<E> p) {
    final E leading = p.leadingCoeff();
    return leading.equals(mElementField.one()) ? p : divide(p, leading);
  }

  /**
   * Compute the greatest common divisor of two polynomials.
   * @param a polynomial
   * @param b nonzero polynomial
   * @return greatest common divisor
   * @exception ArithmeticException if both <code>a</code> and <code>b</code> are 0.
   */
  public Polynomial<E> gcd(Polynomial<E> a, Polynomial<E> b) {
    if (b.equals(zero())) {
      if (a.equals(zero())) {
        throw new ArithmeticException();
      }
      final Polynomial<E> t = a;
      a = b;
      b = t;
    }
    while (!a.equals(zero())) {
      final Polynomial<E> t = a;
      a = divideAndRemainder(b, a)[1];
      b = t;
    }
    return monicAssociate(b);
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private Polynomial<E>[] makeExtendedGcdResult(final Polynomial<E> d, final Polynomial<E> s, final Polynomial<E> t) {
    return (Polynomial<E>[]) new Polynomial[] {d, s, t};
  }

  /**
   * Apply the extended Euclidean algorithm to a pair of polynomials producing
   * the greatest common divisor polynomial and two polynomials <code>u(x), v(x)</code>
   * satisfying <code>d(x)=a(x)u(x)+b(x)v(x)</code>.
   * @param a first polynomial
   * @param b second polynomial
   * @return <code>[d(x), u(x), v(x)]</code>
   */
  public Polynomial<E>[] extendedGcd(Polynomial<E> a, Polynomial<E> b) {
    final boolean swapped;
    if (b.equals(zero())) {
      if (a.equals(zero())) {
        throw new ArithmeticException();
      }
      final Polynomial<E> t = a;
      a = b;
      b = t;
      swapped = true;
    } else {
      swapped = false;
    }
    Polynomial<E> s0 = one();
    Polynomial<E> s1 = zero();
    Polynomial<E> t0 = zero();
    Polynomial<E> t1 = one();
    while (!a.equals(zero())) {
      final Polynomial<E>[] qr = divideAndRemainder(b, a);
      final Polynomial<E> c = a;
      a = qr[1];
      b = c;
      final Polynomial<E> s = subtract(s0, multiply(qr[0], s1));
      s0 = s1;
      s1 = s;
      final Polynomial<E> t = subtract(t0, multiply(qr[0], t1));
      t0 = t1;
      t1 = t;
    }
    final E m = b.leadingCoeff();
    final Polynomial<E> d = monicAssociate(b);
    final Polynomial<E> sm = divide(s0, m);
    final Polynomial<E> tm = divide(t0, m);
    return swapped ? makeExtendedGcdResult(d, sm, tm) : makeExtendedGcdResult(d, tm, sm);
  }

  /**
   * Compute the resultant of a pair of polynomials.
   * @param a first polynomial
   * @param b second polynomial
   * @return resultant
   */
  public E resultant(final Polynomial<E> a, final Polynomial<E> b) {
    final int d = a.degree();
    final int e = b.degree();
    final int n = d + e;
    final MatrixField<E> matrixField = new MatrixField<>(n, mElementField);
    final Matrix<E> m = new DefaultMatrix<>(n, n, mElementField.zero());
    for (int k = 0; k < e; ++k) {
      for (int j = 0; j <= d && j + k < n; ++j) {
        m.set(j + k, k, a.coeff(j));
      }
    }
    for (int k = 0; k < d; ++k) {
      for (int j = 0; j <= e && j + k < n; ++j) {
        m.set(j + k, k + e, b.coeff(j));
      }
    }
    return matrixField.det(m);
  }
}
