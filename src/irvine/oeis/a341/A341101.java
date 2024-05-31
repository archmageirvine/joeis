package irvine.oeis.a341;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A341101 T(n, k) = Sum_{j=0..k} binomial(n, k - j)*Stirling1(n - k + j, j)*(-1)^(n-k). Triangle read by rows, T(n, k) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A341101 extends BaseTriangle {

  /** Construct the sequence. */
  public A341101() {
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(n, k - j)
      .multiply(Functions.STIRLING1.z(n - k + j, (long) j))
      .multiply((((n - k) & 1) == 0) ? 1 : -1));
  }
}
