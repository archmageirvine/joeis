package irvine.math.polynomial;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a028.A028296;

/**
 * Euler polynomials.
 * @author Sean A. Irvine
 */
public final class EulerPolynomials {

  private EulerPolynomials() { }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.HALF.negate(), Q.ONE));

  /**
   * Euler polynomial.
   * @param n index
   * @return polynomial
   */
  public static Polynomial<Q> eulerPolynomial(final int n) {
    final A028296 eulerNumbers = new A028296();
    Polynomial<Q> sum = RING.zero();
    for (int k = 0; k <= n; k += 2) {
      sum = RING.add(sum, RING.multiply(RING.pow(C, n - k), 
        new Q(Binomial.binomial(n, k).multiply(eulerNumbers.next()), Z.ONE.shiftLeft(k))
        ));
    }
    return sum;
  }

  /**
   * Return the nth Euler polynomial evaluated at m.
   * @param n degree
   * @param m point
   * @return polynomial
   */
  public static Q eval(final int n, final Q m) {
    final A028296 eulerNumbers = new A028296();
    Q sum = Q.ZERO;
    final Q x12 = m.subtract(Q.HALF);
    for (int k = 0; k <= n; k += 2) {
      sum = sum.add(x12.pow(n - k).multiply(
        new Q(Binomial.binomial(n, k).multiply(eulerNumbers.next()), Z.ONE.shiftLeft(k))
        ));
    }
    return sum;
  }

}
