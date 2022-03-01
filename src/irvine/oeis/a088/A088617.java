package irvine.oeis.a088;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A088617 Triangle read by rows: T(n,k) = C(n+k,n)*C(n,k)/(k+1), for n &gt;= 0, k = 0..n.
 * @author Georg Fischer
 */
public class A088617 extends Triangle {

  /** Construct the sequence. */
  public A088617() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n + k, n).multiply(Binomial.binomial(n, k)).divide(k + 1);
  }
}
