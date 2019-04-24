package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Fibonacci polynomials.
 * @author Sean A. Irvine
 */
public final class FibonacciPolynomials {

  private FibonacciPolynomials() { }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final List<Polynomial<Z>> FIBONACCI_POLYNOMIALS = new ArrayList<>(2);
  static {
    FIBONACCI_POLYNOMIALS.add(RING.zero());
    FIBONACCI_POLYNOMIALS.add(RING.one());
  }

  /**
   * Fibonacci polynomial.
   * @param n index
   * @return polynomial
   */
  public static Polynomial<Z> fibonacciPolynomial(final int n) {
    while (FIBONACCI_POLYNOMIALS.size() <= n) {
      final int s = FIBONACCI_POLYNOMIALS.size();
      FIBONACCI_POLYNOMIALS.add(RING.add(FIBONACCI_POLYNOMIALS.get(s - 1).shift(1), FIBONACCI_POLYNOMIALS.get(s - 2)));
    }
    return FIBONACCI_POLYNOMIALS.get(n);
  }
}
