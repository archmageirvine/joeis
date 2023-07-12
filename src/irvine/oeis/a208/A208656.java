package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A208656 Triangle T(n, k) = n*C(n,k) - C(n-1,k-1), 1 &lt;= k &lt;= n, read by rows.
 * @author Georg Fischer
 */
public class A208656 extends Triangle {

  /** Construct the sequence. */
  public A208656() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n + 1, k + 1).multiply(n + 1).subtract(Binomial.binomial(n, k));
  }
}
