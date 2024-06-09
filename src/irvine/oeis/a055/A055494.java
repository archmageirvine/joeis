package irvine.oeis.a055;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A055494 Numbers k such that k^2 - k + 1 is prime.
 * @author Georg Fischer
 */
public class A055494 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A055494() {
    this(6, 0);
  }

  /**
   * Generic constructor with parameters
   * @param cyclo number of the cyclotomic polynomial
   * @param skip number of initial terms to skip
   */
  public A055494(final int cyclo, int skip) {
    super(buildCyclotomicMatrix(cyclo), "1", 0);
    while (--skip >= 0) {
      next();
    }
  }

  /**
   * Compute a matrix suitable for <code>HolonomicRecurrenc</code>.
   * @param n number of the cyclotomic polynomial.
   * @return matrix of recurrence coefficients, for example "[[1,-1, 1],[-1]]"
   */
  protected static String buildCyclotomicMatrix(final int n) {
    final Polynomial<Z> poly = CyclotomicPolynomials.cyclotomic(n);
    final StringBuilder sb = new StringBuilder("[");
    for (int k = 0; k <= poly.degree(); ++k) {
      sb.append(k == 0 ? '[' : ',');
      sb.append(poly.coeff(k));
    }
    sb.append("],[-1]]");
    return sb.toString();
  }
}
