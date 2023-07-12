package irvine.oeis.a143;
// manually tresimple at 2023-07-12

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A143814 Triangle T(n,m) read along rows: T(n,m) = n^2 - (m+1)^2 for 1&lt;=m&lt;n-1, T(n,n-1) = n^2-1.
 * @author Georg Fischer
 */
public class A143814 extends BaseTriangle {

  /** Construct the sequence. */
  public A143814() {
    super(2, 2, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int m) {
    return Z.valueOf((m == n - 1) ? (n * n - 1) : (n * n - (m + 1) * (m + 1)));
  }
}
