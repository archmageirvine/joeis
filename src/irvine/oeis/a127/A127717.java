package irvine.oeis.a127;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A127717 Triangle read by rows. T(n, k) = k * binomial(n + 1, k + 1), for 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A127717 extends BaseTriangle {

  /** Construct the sequence. */
  public A127717() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n + 1, k + 1).multiply(k);
  }
}
