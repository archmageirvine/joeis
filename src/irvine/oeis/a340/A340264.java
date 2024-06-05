package irvine.oeis.a340;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A340264 T(n, k) = Sum_{j=0..k} binomial(n, k - j)*Stirling2(n - k + j, j). Triangle read by rows, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A340264 extends BaseTriangle {

  /** Construct the sequence. */
  public A340264() {
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(n, k - j)
      .multiply(Functions.STIRLING2.z(n - k + j, j)));
  }
}
