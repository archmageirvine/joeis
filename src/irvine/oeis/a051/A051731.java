package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A051731 Triangle read by rows: T(n,k) = 1 if k divides n, T(n,k) = 0 otherwise (for n &gt;= 1 and 1 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A051731 extends BaseTriangle {

  /** Construct the sequence. */
  public A051731() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n % k == 0) ? Z.ONE : Z.ZERO;
  }
}
