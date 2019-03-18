package irvine.math.group;

import java.util.Iterator;
import java.util.Map;

import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A multivariate polynomial ring over integers.
 * @author Sean A. Irvine
 */
public class MultivariatePolynomialRing extends AbstractRing<MultivariatePolynomial> {

  // At present only supplies minimal implementations to get things done. This could be improved.
  
  private final Integers mElementRing = Integers.SINGLETON;
  private final MultivariatePolynomial mZeroPolynomial;
  private final MultivariatePolynomial mOnePolynomial;
  private final int mNumVariables;

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param numVariables number of variables
   */
  public MultivariatePolynomialRing(final int numVariables) {
    mNumVariables = numVariables;
    mZeroPolynomial = new MultivariatePolynomial(numVariables);
    mOnePolynomial = MultivariatePolynomial.one(numVariables);
  }

  @Override
  @SuppressWarnings("unchecked")
  public MultivariatePolynomial one() {
    return mOnePolynomial;
  }

  @Override
  public MultivariatePolynomial zero() {
    return mZeroPolynomial;
  }

  /**
   * Construct the variable <code>x_m</code>
   * @param m index
   * @return single variable
   */
  public MultivariatePolynomial var(final int m) {
    final MultivariatePolynomial res = new MultivariatePolynomial(mNumVariables);
    final int[] powers = new int[mNumVariables];
    powers[m] = 1;
    res.put(new MultivariatePolynomial.Term(powers), Z.ONE);
    return res;
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
  public boolean contains(final MultivariatePolynomial a) {
    return a != null;
  }

  @Override
  public MultivariatePolynomial add(final MultivariatePolynomial a, final MultivariatePolynomial b) {
    return a.add(b);
  }

  @Override
  public MultivariatePolynomial negate(final MultivariatePolynomial a) {
    final MultivariatePolynomial t = new MultivariatePolynomial(a.numberVariables());
    for (Map.Entry<MultivariatePolynomial.Term, Z> e : a.entrySet()) {
      t.put(e.getKey(), e.getValue().negate());
    }
    return t;
  }

  @Override
  public Iterator<MultivariatePolynomial> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public MultivariatePolynomial multiply(final MultivariatePolynomial a, final MultivariatePolynomial b) {
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
  public MultivariatePolynomial multiply(final MultivariatePolynomial a, final MultivariatePolynomial b, final int[] degreeLimits) {
    return a.multiply(b, degreeLimits);
  }

  /**
   * Return the polynomial multiplied by the specified value.
   * @param p polynomial
   * @param n multiplicand
   * @return polynomial
   */
  public MultivariatePolynomial multiply(final MultivariatePolynomial p, final Z n) {
    return p.scalarMultiply(n);
  }

  @Override
  public String toString() {
    return mElementRing + "[xyz...]";
  }

  @Override
  public MultivariatePolynomial coerce(final long n) {
    return mOnePolynomial.scalarMultiply(Z.valueOf(n));
  }

  @Override
  public Z characteristic() {
    return mElementRing.characteristic();
  }
}
