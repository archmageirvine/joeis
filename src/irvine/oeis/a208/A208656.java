package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A208656 Triangular array:  n*C(n,k)-(n-1,k-1), 1&lt;=k&lt;=n, rows read in reverse order.
 * @author Georg Fischer
 */
public class A208656 extends Triangle {

  /** Construct the sequence. */
  public A208656() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n + 1, k + 1).multiply(n + 1).subtract(Binomial.binomial(n, k));
  }
}
