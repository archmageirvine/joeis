package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A060821 Triangle read by rows. T(n, k) are the coefficients of the Hermite polynomial of order n, for 0 &lt;= k &lt;= n.
 * <code>T(n, k) = ((-1)^((n-k)/2))*(2^k)*n!/(k!*((n-k)/2)!)</code> if n-k is even and &gt;= 0, else 0.
 * @author Georg Fischer
 */
public class A060821 extends Triangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  @Override
  public Z compute(final int n, final int k) {
    final int nk = n - k;
    if ((nk & 1) == 1) {
      return Z.ZERO;
    }
    final int nk2 = nk / 2;
    return Z.ONE.shiftLeft(k).multiply(FACTORIAL.factorial(n))
      .divide(FACTORIAL.factorial(k).multiply(FACTORIAL.factorial(nk2))).multiply((nk2 & 1) == 0 ? 1 : -1);
  }
}
