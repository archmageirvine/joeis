package irvine.math.group;

import java.util.Iterator;
import java.util.Map;

import irvine.math.api.Field;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Z;

/**
 * A multivariate polynomial ring over integers.
 * @param <E> underlying coefficient type
 * @author Sean A. Irvine
 */
public class MultivariatePolynomialRing<E> extends AbstractRing<MultivariatePolynomial<E>> {

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
  public MultivariatePolynomialRing(final Field<E> coefficientField, final int numVariables) {
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
}
