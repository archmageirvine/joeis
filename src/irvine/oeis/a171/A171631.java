package irvine.oeis.a171;
// manually 2023-06-30

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A171631 Triangle read by rows: T(n,k) = n*(binomial(n-2, k-1) + n*binomial(n-2, k)),  n &gt; 0 and 0 &lt;= k &lt;= n - 1.
 * @author Georg Fischer
 */
public class A171631 extends BaseTriangle {

  /** Construct the sequence. */
  public A171631() {
    super(1, 1, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == 1) ? Z.ONE : Binomial.binomial(n - 2, k - 1).add(Binomial.binomial(n - 2, k).multiply(n)).multiply(n);
  }
}
