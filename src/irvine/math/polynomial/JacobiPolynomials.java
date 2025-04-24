package irvine.math.polynomial;

import irvine.math.cr.CR;
import irvine.math.group.PolynomialRing;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Jacobi polynomials.
 * @author Sean A. Irvine
 */
public final class JacobiPolynomials {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final Polynomial<Q> CM = Polynomial.create(new Q(-1, 2), Q.HALF);
  private static final Polynomial<Q> CP = Polynomial.create(Q.HALF, Q.HALF);

  /**
   * Compute Jacobi polynomial as a polynomial over rationals.
   * @param alpha alpha parameter
   * @param beta beta parameter
   * @param n index
   * @return Jacobi polynomial
   */
  public static Polynomial<Q> p(final int alpha, final int beta, final long n) {
    Polynomial<Q> res = RING.zero();
    for (long m = 0; m <= n; ++m) {
      final Z c = Binomial.binomial(n + alpha, n - m).multiply(Binomial.binomial(n + beta, m));
      final Polynomial<Q> t = RING.multiply(RING.pow(CM, m), RING.pow(CP, n - m));
      res = RING.add(res, RING.multiply(t, Q.valueOf(c)));
    }
    return res;
  }

  /**
   * Evaluate a Jacobi polynomial at a rational value.
   * @param alpha alpha parameter
   * @param beta beta parameter
   * @param n index
   * @param z real parameter
   * @return value
   */
  public static Q p(final int alpha, final int beta, final long n, final Q z) {
    return RING.eval(p(alpha, beta, n), z);
  }

  /**
   * Evaluate a Jacobi polynomial at a real value.
   * @param alpha alpha parameter
   * @param beta beta parameter
   * @param n index
   * @param z real parameter
   * @return value
   */
  public static CR p(final int alpha, final int beta, final long n, final CR z) {
    return PolynomialUtils.eval(p(alpha, beta, n), z);
  }
}
