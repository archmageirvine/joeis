package irvine.math.polynomial;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Laguerre polynomials.
 * @author Sean A. Irvine
 */
public final class LaguerrePolynomials {

  private LaguerrePolynomials() {
  }

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);

  /**
   * Compute Jacobi polynomial as a polynomial over rationals.
   * @param alpha alpha parameter
   * @param n index
   * @return Jacobi polynomial
   */
  public static Polynomial<Q> p(final int alpha, final long n) {
    final Polynomial<Q> res = RING.empty();
    for (long m = 0; m <= n; ++m) {
      res.add(new Q(Z.NEG_ONE.pow(m).multiply(Binomial.binomial(n + alpha, n - m)), Functions.FACTORIAL.z(m)));
    }
    return res;
  }

  /**
   * Evaluate a Jacobi polynomial at a rational value.
   * @param alpha alpha parameter
   * @param n index
   * @param z real parameter
   * @return value
   */
  public static Q p(final int alpha, final long n, final Q z) {
    return RING.eval(p(alpha, n), z);
  }

  /**
   * Evaluate a Jacobi polynomial at a real value.
   * @param alpha alpha parameter
   * @param n index
   * @param z real parameter
   * @return value
   */
  public static CR p(final int alpha, final long n, final CR z) {
    return PolynomialUtils.eval(p(alpha, n), z);
  }
}
