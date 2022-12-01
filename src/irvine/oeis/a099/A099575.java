package irvine.oeis.a099;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A099575 Number triangle T(n,k) = binomial(n + floor(k/2) + 1, n + 1), 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A099575 extends BaseTriangle {

  /** Construct the sequence. */
  public A099575() {
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n + k / 2 + 1, n + 1);
  }
}
