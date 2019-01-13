package irvine.math.q;

import java.util.Iterator;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;

/**
 * Field of rationals with one extension under addition and multiplication.
 * @author Sean A. Irvine
 */
public final class RationalUnityExtension extends PolynomialRingField<Q> {

  // Note some of the "advanced" operations could be completely bogus here;
  // addition and multiplication should work as expected

  private final int mPower;
  private final Q mReplacement;

  /**
   * Construct the field <code>Q(indeterminate)</code> where <code>indeterminate^n=v</code>.
   * @param indeterminate symbol to use for indeterminate
   * @param n power
   * @param v value of indeterminate to the power
   */
  public RationalUnityExtension(final String indeterminate, final int n, final Q v) {
    super(indeterminate, Rationals.SINGLETON);
    mPower = n;
    mReplacement = v;
  }

  /**
   * Construct the extension field of the rationals for a nth root of unity.
   * The roots are then <code>z^j</code> for <code>0&lt;=j&lt;n</code>.
   * @param n power
   */
  public RationalUnityExtension(final int n) {
    this("z", n, Q.ONE);
  }

  /**
   * Return the power such that the indeterminate raised to the power is the value.
   * @return the power
   */
  public int power() {
    return mPower;
  }

  @Override
  public Polynomial<Q> multiply(final Polynomial<Q> a, final Polynomial<Q> b) {
    final int d = a.degree();
    final int e = b.degree();
    final Polynomial<Q> t = new Polynomial<>(mIndeterminate, mZero, mOne);
    for (int k = d + e; k >= 0; --k) {
      t.add(mZero);
    }
    for (int k = 0; k <= d; ++k) {
      final Q ck = a.coeff(k);
      if (!mZero.equals(ck)) {
        for (int j = 0; j <= e; ++j) {
          Q v = Rationals.SINGLETON.multiply(ck, b.coeff(j));
          int p = k + j;
          while (p >= mPower) {
            p -= mPower;
            v = Rationals.SINGLETON.multiply(v, mReplacement);
          }
          t.set(p, Rationals.SINGLETON.add(t.coeff(p), v));
        }
      }
    }
    t.fixDegree();
    return t;
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
  public boolean contains(final Polynomial<Q> element) {
    return element.degree() <= mPower;
  }

  @Override
  public Iterator<Polynomial<Q>> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    return "\\Q(" + mIndeterminate + ")";
  }
}
