package irvine.math.polynomial;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;

/**
 * Bernoulli polynomials of the second kind.
 * @author Sean A. Irvine
 */
public final class BernoulliPolynomials {

  private BernoulliPolynomials() { }

  private static final PolynomialRingField<Q> RING_X = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>("z", RING_X);
  private static final Polynomial<Polynomial<Q>> C = RING.onePlusXToTheN(1);
  private static final BernoulliPolynomials SINGLETON = new BernoulliPolynomials();

  /**
   * Return the nth Bernoulli polynomial of the second kind.
   * @param n degree
   * @return polynomial
   */
  public static Polynomial<Q> secondKind(final int n) {
    return SINGLETON.get2(n);
  }

  /**
   * Return the nth Bernoulli polynomial of the second kind evaluated at m.
   * @param n degree
   * @param m point
   * @return polynomial
   */
  public static Q secondKindEval(final int n, final Q m) {
    return RING_X.eval(SINGLETON.get2(n), m);
  }

  private Polynomial<Polynomial<Q>> mGf = RING.one();

  private Polynomial<Q> get2(final int n) {
    if (n > mGf.degree()) {
      compute2(n);
    }
    return mGf.coeff(n);
  }

  private void compute2(final int n) {
    mGf = RING.series(RING.pow(C, RING_X.x(), n).shift(1), RING.log(C, n + 1), n);
  }

  /**
   * Return the nth Bernoulli polynomial of the first kind.
   * @param n degree
   * @return polynomial
   */
  public static Polynomial<Q> firstKind(final int n) {
    final Polynomial<Q> poly = new Polynomial<>("x", Q.ZERO, Q.ONE);
    final BernoulliSequence s = new BernoulliSequence(0);
    for (int k = 0; k <= n; ++k) {
      poly.add(s.get(n - k).multiply(Binomial.binomial(n, k)));
    }
    return poly;
  }

  /**
   * Return the nth Bernoulli polynomial of the first kind evaluated at m.
   * @param n degree
   * @param m point
   * @return polynomial
   */
  public static Q firstKindEval(final int n, final Q m) {
    final BernoulliSequence s = new BernoulliSequence(0);
    Q sum = Q.ZERO;
    Q x = Q.ONE;
    for (int k = 0; k <= n; ++k, x = x.multiply(m)) {
      sum = sum.add(s.get(n - k).multiply(Binomial.binomial(n, k)).multiply(x));
    }
    return sum;
  }
}
