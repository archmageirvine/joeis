package irvine.math.q;

import java.util.Iterator;

import irvine.math.cr.CR;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;

/**
 * Field of rationals modulo a polynomial.
 * @author Sean A. Irvine
 */
public class CyclotomicExtension extends PolynomialRingField<Q> {

  private final Polynomial<Q> mMod;
  private final long mCyclotomicOrder;
  private final PolynomialRingField<Q> mPolynomialRing;

  /**
   * Construct the field <code>Q(indeterminate)</code> where <code>indeterminate^n=v</code>.
   * @param indeterminate symbol to use for indeterminate
   * @param modulus modulus
   */
  private CyclotomicExtension(final String indeterminate, final Polynomial<Q> modulus, final long cyclotomicOrder) {
    super(indeterminate, Rationals.SINGLETON);
    mMod = modulus;
    mCyclotomicOrder = cyclotomicOrder;
    mPolynomialRing = new PolynomialRingField<>(indeterminate, Rationals.SINGLETON); // used for inverses
  }

  /**
   * Construct the field <code>Q(indeterminate)</code> where <code>indeterminate^n=v</code>.
   * @param indeterminate symbol to use for indeterminate
   * @param modulus modulus
   */
  public CyclotomicExtension(final String indeterminate, final Polynomial<Q> modulus) {
    this(indeterminate, modulus, -1);
  }

  /**
   * Construct the extension field of the rationals over a cyclotomic polynomial.
   * @param n power
   */
  public CyclotomicExtension(final long n) {
    this("z", PolynomialUtils.zToQ(CyclotomicPolynomials.cyclotomic(n)), n);
  }

  /**
   * Return the modulus.
   * @return the modulus
   */
  public Polynomial<Q> modulus() {
    return mMod;
  }

  @Override
  public Polynomial<Q> add(final Polynomial<Q> a, final Polynomial<Q> b) {
    return mod(super.add(a, b), mMod);
  }

  @Override
  public Polynomial<Q> multiply(final Polynomial<Q> a, final Polynomial<Q> b) {
    return mod(super.multiply(a, b), mMod);
  }

  @Override
  public Polynomial<Q> multiply(final Polynomial<Q> a, final Polynomial<Q> b, final int degreeLimit) {
    return multiply(a, b).truncate(degreeLimit);
  }

  @Override
  public Polynomial<Q> pow(final Polynomial<Q> b, final long n) {
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
    final Polynomial<Q> s = pow(multiply(b, b), n / 2);
    return (n & 1) == 0 ? s : multiply(s, b);
  }

  @Override
  public Iterator<Polynomial<Q>> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    return "\\Q[z]/(" + mMod + ")";
  }

  /**
   * The norm of the polynomial.
   * @param p polynomial
   * @return norm
   */
  public Q norm(final Polynomial<Q> p) {
    return resultant(mMod, p);
  }

  @Override
  public Polynomial<Q> inverse(final Polynomial<Q> p) {
    if (isZero(p)) {
      throw new ArithmeticException("Division by zero");
    }

    // Do the Euclidean algorithm using ordinary polynomial arithmetic.
    final Polynomial<Q>[] egcd = mPolynomialRing.extendedGcd(mMod, p);
    if (!mPolynomialRing.one().equals(egcd[0])) {
      throw new ArithmeticException("Element is not invertible");
    }
    return mod(egcd[2], mMod);
  }

  @Override
  public Polynomial<Q> divide(final Polynomial<Q> numerator, final Polynomial<Q> denominator) {
    return multiply(numerator, inverse(denominator));
  }

  /**
   * Complex conjugate in a cyclotomic field.
   * @param p element
   * @return complex conjugate
   */
  public Polynomial<Q> conjugate(final Polynomial<Q> p) {
    if (mCyclotomicOrder < 0) {
      throw new UnsupportedOperationException();
    }
    final Polynomial<Q> inverseX = pow(x(), mCyclotomicOrder - 1);
    Polynomial<Q> result = zero();
    for (int k = p.degree(); k >= 0; --k) {
      result = add(multiply(result, inverseX), monomial(p.coeff(k), 0));
    }
    return result;
  }

  /**
   * Convert a real cyclotomic element to CR.
   * @param p element to convert
   * @return corresponding real number
   */
  public CR toCR(final Polynomial<Q> p) {
    if (mCyclotomicOrder < 1) {
      throw new UnsupportedOperationException("Cyclotomic order unknown");
    }
    if (!conjugate(p).equals(p)) {
      throw new IllegalArgumentException("Element is not real");
    }
    CR sum = CR.ZERO;
    for (int k = 0; k <= p.degree(); ++k) {
      long j = k % mCyclotomicOrder;
      if (2L * j > mCyclotomicOrder) {
        j = mCyclotomicOrder - j;
      }
      if (j == 0) {
        sum = sum.add(CR.valueOf(p.coeff(k)));
      } else {
        final CR angle = CR.PI.multiply(2L * j).divide(mCyclotomicOrder);
        sum = sum.add(angle.cos().multiply(p.coeff(k)));
      }
    }
    return sum;
  }

  /**
   * Determine the sign of a real element.
   * @param p element
   * @return -1, 0, or 1
   */
  public int signum(final Polynomial<Q> p) {
    if (isZero(p)) {
      return 0;
    }
    if (!conjugate(p).equals(p)) {
      throw new IllegalArgumentException("Element is not real");
    }
    return toCR(p).signum();
  }

  /**
   * Compare two real elements.
   * @param p first element
   * @param q second element
   * @return -1, 0, or 1
   */
  public int compare(final Polynomial<Q> p, final Polynomial<Q> q) {
    return signum(subtract(p, q));
  }
}
