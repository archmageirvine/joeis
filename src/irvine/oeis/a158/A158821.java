package irvine.oeis.a158;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A158821 Triangle read by rows: row n (n&gt;=0) ends with 1, and for n&gt;=1 begins with n; other entries are zero.
 * @author Georg Fischer
 */
public class A158821 extends BaseTriangle {

  /** Construct the sequence. */
  public A158821() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    if (k + n == 0) {
      return Z.ONE;
    }
    return (k == n) ? Z.ONE : ((k == 0) ? Z.valueOf(n) : Z.ZERO);
  }
}
