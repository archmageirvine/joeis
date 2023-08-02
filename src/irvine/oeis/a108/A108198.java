package irvine.oeis.a108;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A108198 Triangle read by rows: T(n,k) = binomial(2k+2,k+1)*binomial(n,k)/(k+2) (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A108198 extends Triangle {

  /** Construct the sequence. */
  public A108198() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(2L * k + 2, k + 1).multiply(Binomial.binomial(n, k)).divide(k + 2);
  }
}
