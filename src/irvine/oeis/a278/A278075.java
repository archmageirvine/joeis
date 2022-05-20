package irvine.oeis.a278;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A278075 Coefficients of the signed Fubini polynomials in ascending order, F_n(x) = Sum_{k=0..n} (-1)^n*Stirling2(n,k)*k!*(-x)^k.
 * @author Georg Fischer
 */
public class A278075 extends Triangle {

  /** Construct the sequence. */
  public A278075() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).subtract(get(n - 1, k)).multiply(k);
  }
}
