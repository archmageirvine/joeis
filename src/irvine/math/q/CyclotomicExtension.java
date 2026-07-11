package irvine.math.q;

import java.util.Iterator;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;

/**
 * Field of rationals modulo a polynomial.
 * @author Sean A. Irvine
 */
public final class CyclotomicExtension extends PolynomialRingField<Q> {

  private final Polynomial<Q> mMod;

  /**
   * Construct the field <code>Q(indeterminate)</code> where <code>indeterminate^n=v</code>.
   * @param indeterminate symbol to use for indeterminate
   * @param modulus modulus
   */
  public CyclotomicExtension(final String indeterminate, final Polynomial<Q> modulus) {
    super(indeterminate, Rationals.SINGLETON);
    mMod = modulus;
  }

  /**
   * Construct the extension field of the rationals over a cyclotomic polynomial.
   * @param n power
   */
  public CyclotomicExtension(final long n) {
    this("z", PolynomialUtils.zToQ(CyclotomicPolynomials.cyclotomic(n)));
  }

  /**
   * Return the modulus.
   * @return the modulus
   */
  public Polynomial<Q> modulus() {
    return mMod;
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
}
