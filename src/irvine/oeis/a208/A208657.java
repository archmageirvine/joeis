package irvine.oeis.a208;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A208657 Triangular array read by rows: n*binomial(n,n-k+1)-binomial(n-1,n-k) with k = 1..n, n &gt;= 1.
 * @author Georg Fischer
 */
public class A208657 extends Triangle {

  /** Construct the sequence. */
  public A208657() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(n + 1, n - k + 1).multiply(n + 1).subtract(Binomial.binomial(n, n - k));
  }
}
