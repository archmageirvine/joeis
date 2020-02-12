package irvine.math.group;

import java.util.Iterator;
import java.util.Map;

import irvine.math.api.Ring;
import irvine.math.polynomial.QPolynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A polynomial with rational powers where individuals elements are drawn from a ring.
 * @author Sean A. Irvine
 * @param <E> underlying type of polynomial elements
 */
public class QPolynomialRing<E> extends AbstractRing<QPolynomial<E>> {

  private final Ring<E> mElementRing;
  protected final E mZero;
  protected final E mOne;
  protected final String mIndeterminate;
  private final QPolynomial<E> mZeroPolynomial;
  private final QPolynomial<E> mOnePolynomial;
  private final QPolynomial<E> mXPolynomial;

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param indeterminate the indeterminate symbol
   * @param elementRing ring of underlying elements
   */
  public QPolynomialRing(final String indeterminate, final Ring<E> elementRing) {
    mIndeterminate = indeterminate;
    mElementRing = elementRing;
    mZero = mElementRing.zero();
    mOne = mElementRing.one();
    mZeroPolynomial = new QPolynomial<>(mIndeterminate, mZero, mOne);
    mOnePolynomial = new QPolynomial<>(mIndeterminate, mZero, mOne);
    mOnePolynomial.put(Q.ZERO, mOne);
    mXPolynomial = new QPolynomial<>(mIndeterminate, mZero, mOne);
    mXPolynomial.put(Q.ONE, mOne);
  }

  /**
   * Construct a new polynomial ring for matrices of a specified size.
   * @param elementRing ring of underlying elements
   */
  public QPolynomialRing(final Ring<E> elementRing) {
    this("q", elementRing);
  }

  @Override
  @SuppressWarnings("unchecked")
  public QPolynomial<E> one() {
    return mOnePolynomial;
  }

  @Override
  public QPolynomial<E> zero() {
    return mZeroPolynomial;
  }

  /**
   * The monic polynomial <code>x</code>.
   * @return the degree 1 polynomial <code>x</code>
   */
  public QPolynomial<E> x() {
    return mXPolynomial;
  }

  /**
   * Return the polynomial <code>1+a*x^n</code>.
   *
   * @param a coefficient
   * @param n the power
   * @return the polynomial
   */
  public QPolynomial<E> onePlusXToTheN(final E a, final Q n) {
    final QPolynomial<E> p = new QPolynomial<>(mIndeterminate, mZero, mOne);
    p.put(n, a);
    if (!Q.ZERO.equals(n)) {
      p.put(Q.ZERO, mOne);
    }
    return p;
  }

  /**
   * Return the polynomial <code>1+x^n</code>.
   *
   * @param n the power
   * @return the polynomial
   */
  public QPolynomial<E> onePlusXToTheN(final Q n) {
    return onePlusXToTheN(mOne, n);
  }

  /**
   * Return the polynomial <code>1-a*x^n</code>.
   *
   * @param a coefficient
   * @param n the power
   * @return the polynomial
   */
  public QPolynomial<E> oneMinusXToTheN(final E a, final Q n) {
    final QPolynomial<E> p = new QPolynomial<>(mIndeterminate, mZero, mOne);
    if (Q.ZERO.equals(n)) {
      p.put(n, mElementRing.subtract(mOne, a));
    } else {
      p.put(Q.ZERO, mOne);
      p.put(n, mElementRing.negate(a));
    }
    return p;
  }

  /**
   * Return the polynomial <code>1-x^n</code>.
   *
   * @param n the power
   * @return the polynomial
   */
  public QPolynomial<E> oneMinusXToTheN(final Q n) {
    return oneMinusXToTheN(mOne, n);
  }

  /**
   * Return the polynomial <code>ax^n</code>.
   *
   * @param a coefficient
   * @param n power
   * @return monomial
   * @exception NullPointerException if <code>a</code> is null.
   */
  public QPolynomial<E> monomial(final E a, final Q n) {
    if (a == null) {
      throw new NullPointerException();
    }
    final QPolynomial<E> p = new QPolynomial<>(mIndeterminate, mZero, mOne);
    p.put(n, a);
    return p;
  }

  /**
   * Evaluate the polynomial at the specified point.
   * @param p the polynomial
   * @param x value
   * @return polynomial evaluated at <code>x</code>
   */
  public E eval(final QPolynomial<E> p, final E x) {
    // Somewhat tricky is assumes E supports raising of powers in Q
    throw new UnsupportedOperationException();
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
  public boolean contains(final QPolynomial<E> a) {
    return a != null;
  }

  @Override
  public QPolynomial<E> add(final QPolynomial<E> a, final QPolynomial<E> b) {
    final QPolynomial<E> t = new QPolynomial<>(mIndeterminate, mZero, mOne);
    t.putAll(a);
    for (final Map.Entry<Q, E> e : b.entrySet()) {
      final Q p = e.getKey();
      t.put(p, mElementRing.add(t.coeff(p), e.getValue()));
    }
    return t;
  }

  @Override
  public QPolynomial<E> negate(final QPolynomial<E> a) {
    final QPolynomial<E> t = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : a.entrySet()) {
      t.put(e.getKey(), mElementRing.negate(e.getValue()));
    }
    return t;
  }

  @Override
  public Iterator<QPolynomial<E>> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public QPolynomial<E> multiply(final QPolynomial<E> a, final QPolynomial<E> b) {
    final QPolynomial<E> t = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : a.entrySet()) {
      final Q p = e.getKey();
      final E v = e.getValue();
      for (final Map.Entry<Q, E> d : b.entrySet()) {
        final Q s = p.add(d.getKey());
        t.put(s, mElementRing.add(t.coeff(s), mElementRing.multiply(v, d.getValue())));
      }
    }
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
  public QPolynomial<E> multiply(final QPolynomial<E> a, final QPolynomial<E> b, final Q degreeLimit) {
    final QPolynomial<E> t = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : a.entrySet()) {
      final Q p = e.getKey();
      if (p.compareTo(degreeLimit) <= 0) {
        final E v = e.getValue();
        for (final Map.Entry<Q, E> d : b.entrySet()) {
          final Q s = p.add(d.getKey());
          if (s.compareTo(degreeLimit) <= 0) {
            t.put(s, mElementRing.add(t.coeff(s), mElementRing.multiply(v, d.getValue())));
          }
        }
      }
    }
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
  public QPolynomial<E> multiply(final QPolynomial<E> a, final QPolynomial<E> b, final int degreeLimit) {
    return multiply(a, b, new Q(degreeLimit));
  }

  /**
   * Compute a polynomial raised to a power discarding all terms greater
   * than the specified degree limit.
   * @param p the polynomial
   * @param n power
   * @param degreeLimit degree limit
   * @return <code>p^n</code>
   */
  public QPolynomial<E> pow(final QPolynomial<E> p, final int n, final Q degreeLimit) {
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
      final QPolynomial<E> s = multiply(p, p, degreeLimit);
      return multiply(s, s, degreeLimit);
    default:
      final QPolynomial<E> u = pow(p, n / 2, degreeLimit);
      final QPolynomial<E> t = multiply(u, u, degreeLimit);
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
  public QPolynomial<E> pow(final QPolynomial<E> p, final int n, final int degreeLimit) {
    return pow(p, n, new Q(degreeLimit));
  }

  @Override
  public QPolynomial<E> subtract(final QPolynomial<E> a, final QPolynomial<E> b) {
    final QPolynomial<E> t = new QPolynomial<>(mIndeterminate, mZero, mOne);
    t.putAll(a);
    for (final Map.Entry<Q, E> e : b.entrySet()) {
      final Q p = e.getKey();
      t.put(p, mElementRing.subtract(t.coeff(p), e.getValue()));
    }
    return t;
  }

  /**
   * Return the polynomial multiplied by the specified value.
   * @param p polynomial
   * @param n multiplicand
   * @return polynomial
   */
  public QPolynomial<E> multiply(final QPolynomial<E> p, final E n) {
    if (mOne.equals(n)) {
      return p;
    }
    if (mZero.equals(n)) {
      return zero();
    }
    final QPolynomial<E> c = new QPolynomial<>(mIndeterminate, mZero, mOne);
    for (final Map.Entry<Q, E> e : p.entrySet()) {
      c.put(e.getKey(), mElementRing.multiply(e.getValue(), n));
    }
    return c;
  }

  /**
   * Return a polynomial multiplied by <code>x^n</code>.  Works for positive,
   * zero, and negative <code>n</code>.
   * @param p polynomial
   * @param n power
   * @return shifted polynomial
   */
  public QPolynomial<E> shift(final QPolynomial<E> p, final int n) {
    return p.shift(n);
  }

  /**
   * Compute Dedekind eta function for a polynomial out to the specified degree.
   * @param p polynomial
   * @param maxDegree maximum degree of expansion
   * @return eta function
   */
  public QPolynomial<E> eta(final QPolynomial<E> p, final int maxDegree) {
    QPolynomial<E> prod = one();
    for (int k = 1; k <= maxDegree; ++k) {
      prod = multiply(prod, subtract(one(), pow(p, k, maxDegree)), maxDegree);
    }
    return prod;
  }

  @Override
  public String toString() {
    return mElementRing.toString() + "[" + mIndeterminate + "]";
  }

  @Override
  public QPolynomial<E> coerce(final long n) {
    final QPolynomial<E> p = new QPolynomial<>(mIndeterminate, mZero, mOne);
    p.put(Q.ZERO, mElementRing.coerce(n));
    return p;
  }

  @Override
  public Z characteristic() {
    return mElementRing.characteristic();
  }
}
