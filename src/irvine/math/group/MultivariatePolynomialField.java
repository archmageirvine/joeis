package irvine.math.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import irvine.math.api.Field;
import irvine.math.function.Functions;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A multivariate polynomial field over a field.
 * @param <E> underlying coefficient type
 * @author Sean A. Irvine
 */
public class MultivariatePolynomialField<E> extends AbstractField<MultivariatePolynomial<E>> {
  // At present only supplies minimal implementations to get things done. This could be improved.

  private final Field<E> mCoefficientField;
  private final MultivariatePolynomial<E> mZeroPolynomial;
  private final MultivariatePolynomial<E> mOnePolynomial;
  private final int mNumVariables;

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param coefficientField underlying coefficient field
   * @param numVariables number of variables
   */
  public MultivariatePolynomialField(final Field<E> coefficientField, final int numVariables) {
    mCoefficientField = coefficientField;
    mNumVariables = numVariables;
    mZeroPolynomial = new MultivariatePolynomial<>(coefficientField, numVariables);
    mOnePolynomial = MultivariatePolynomial.one(coefficientField, numVariables);
  }

  @Override
  public MultivariatePolynomial<E> one() {
    return mOnePolynomial;
  }

  @Override
  public MultivariatePolynomial<E> zero() {
    return mZeroPolynomial;
  }

  /**
   * Construct the variable <code>x_m</code>
   * @param m index
   * @return single variable
   */
  public MultivariatePolynomial<E> var(final int m) {
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, mNumVariables);
    final int[] powers = new int[mNumVariables];
    powers[m] = 1;
    res.put(new MultivariatePolynomial.Term(powers), mCoefficientField.one());
    return res;
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean isCommutative() {
    return mCoefficientField.isCommutative();
  }

  @Override
  public boolean isIntegralDomain() {
    return mCoefficientField.isIntegralDomain();
  }

  @Override
  public boolean contains(final MultivariatePolynomial<E> a) {
    return a != null;
  }

  @Override
  public MultivariatePolynomial<E> add(final MultivariatePolynomial<E> a, final MultivariatePolynomial<E> b) {
    return a.add(b);
  }

  @Override
  public MultivariatePolynomial<E> negate(final MultivariatePolynomial<E> a) {
    final MultivariatePolynomial<E> t = new MultivariatePolynomial<>(mCoefficientField, a.numberVariables());
    for (Map.Entry<MultivariatePolynomial.Term, E> e : a.entrySet()) {
      t.put(e.getKey(), mCoefficientField.negate(e.getValue()));
    }
    return t;
  }

  @Override
  public Iterator<MultivariatePolynomial<E>> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public MultivariatePolynomial<E> multiply(final MultivariatePolynomial<E> a, final MultivariatePolynomial<E> b) {
    return a.multiply(b);
  }

  /**
   * Multiply a polynomial by another polynomial and return the resulting
   * polynomial with a limited maximum degree.
   * @param a polynomial to be multiplied
   * @param b polynomial to multiply by
   * @param degreeLimits maximum degrees to retain
   * @return product
   */
  public MultivariatePolynomial<E> multiply(final MultivariatePolynomial<E> a, final MultivariatePolynomial<E> b, final int[] degreeLimits) {
    return a.multiply(b, degreeLimits);
  }

  /**
   * Return the polynomial multiplied by the specified value.
   * @param p polynomial
   * @param n multiplicand
   * @return polynomial
   */
  public MultivariatePolynomial<E> multiply(final MultivariatePolynomial<E> p, final E n) {
    return p.scalarMultiply(n);
  }

  /**
   * Return the polynomial divided by the specified value.
   * @param p polynomial
   * @param n divisor
   * @return polynomial
   */
  public MultivariatePolynomial<E> divide(final MultivariatePolynomial<E> p, final E n) {
    return p.scalarDivide(n);
  }

  @Override
  public String toString() {
    return mCoefficientField + "[xyz...]";
  }

  @Override
  public MultivariatePolynomial<E> coerce(final long n) {
    return mOnePolynomial.scalarMultiply(mCoefficientField.coerce(n));
  }

  @Override
  public Z characteristic() {
    return mCoefficientField.characteristic();
  }

  @Override
  public MultivariatePolynomial<E> inverse(final MultivariatePolynomial<E> element) {
    throw new UnsupportedOperationException();
  }

  /**
   * Expand the bivariate polynomial ratio <code>num/den</code> extracting the univariate
   * coefficient <code>[y^ycoeff]</code> and return the result as a univariate polynomial
   * series to the specified order.
   * @param num numerator
   * @param den denominator
   * @param ycoeff <i>y</i>-coefficient
   * @param xorder order of series to return
   * @return univariate polynomial series in first variable
   */
  public Polynomial<E> series(final MultivariatePolynomial<E> num, final MultivariatePolynomial<E> den, final int ycoeff, final int xorder) {
    if (num.numberVariables() != 2 || den.numberVariables() != 2) {
      throw new IllegalArgumentException();
    }
    //System.out.println("series = ( " + num + ")/(" + den + ")");
    final PolynomialRingField<E> field = new PolynomialRingField<>(mCoefficientField);
    final ArrayList<Polynomial<E>> a = new ArrayList<>();
    final Polynomial<E> d = den.extract(1, 0).toPolynomial(); // y^0
    for (int k = 0; k <= ycoeff; ++k) {
      Polynomial<E> s = num.extract(1, k).toPolynomial(); // y^k
      for (int j = 0; j < k; ++j) {
        s = field.subtract(s, field.multiply(a.get(j), den.extract(1, k - j).toPolynomial()));
      }
      a.add(field.series(s, d, xorder));
    }
    return a.get(ycoeff);
  }

  /**
   * Powering. Computes <code>b^n</code> with variable specific degree limits.
   * @param b base
   * @param n power
   * @param degreeLimits degree limits
   * @return <code>b^n</code>
   * @exception ArithmeticException if <code>n</code> is negative
   * and power would entail a non-integral result.
   */
  public MultivariatePolynomial<E> pow(final MultivariatePolynomial<E> b, final long n, final int[] degreeLimits) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    // x^0
    if (n == 0) {
      return one();
    }
    // 0^x, 1^x, cannot use .equals() because of CR type
    if (b == zero() || b == one()) {
      return b;
    }
    // x^1
    if (n == 1) {
      return b;
    }
    final MultivariatePolynomial<E> s = pow(multiply(b, b, degreeLimits), n / 2);
    return (n & 1) == 0 ? s : multiply(s, b, degreeLimits);
  }

  /**
   * Construct a monomial multivariate polynomial
   * @param value coefficient
   * @param powers powers of variables
   * @return monomial
   */
  public MultivariatePolynomial<E> monomial(final E value, final int[] powers) {
    final MultivariatePolynomial<E> res = new MultivariatePolynomial<>(mCoefficientField, powers.length);
    res.put(new MultivariatePolynomial.Term(powers), value);
    return res;
  }

  /**
   * Series expansion of <code>exp(p)</code> to specified degree.
   * @param p polynomial
   * @param n maximum degrees
   * @return series for <code>exp(p)</code>.
   */
  public MultivariatePolynomial<E> exp(final MultivariatePolynomial<E> p, final int[] n) {
    final RingFactorial<E> f = RingFactorial.instance(mCoefficientField);
    MultivariatePolynomial<E> s = one();
    if (!zero().equals(p)) {
      final int lim = Functions.MAX.i(n);
      for (int k = 1; k <= lim; ++k) {
        s = add(s, divide(pow(p, k, n), f.factorial(k)));
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>log(1+p)</code> to specified number of terms.
   * @param p polynomial
   * @param n maximum degrees
   * @return series for <code>log(1+p)</code>.
   */
  public MultivariatePolynomial<E> log1p(final MultivariatePolynomial<E> p, final int[] n) {
    MultivariatePolynomial<E> s = zero();
    if (!zero().equals(p)) {
      final int lim = Functions.MAX.i(n);
      E kk = mCoefficientField.one();
      for (int k = 1; k <= lim; ++k, kk = mCoefficientField.add(kk, mCoefficientField.one())) {
        s = signedAdd((k & 1) == 1, s, divide(pow(p, k, n), kk));
      }
    }
    return s;
  }

  /**
   * Series expansion of <code>log(p)</code> to specified number of terms.
   * @param p polynomial (assumed to have leading coefficient of 1)
   * @param n maximum degrees
   * @return series for <code>log(p)</code>.
   */
  public MultivariatePolynomial<E> log(final MultivariatePolynomial<E> p, final int[] n) {
    return log1p(subtract(p, one()), n);
  }
}
