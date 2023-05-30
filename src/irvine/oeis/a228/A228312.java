package irvine.oeis.a228;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A228312 Triangle read by rows: T(m,n) (1&lt;=n&lt;=m) is the hyper-Wiener index of the complete bipartite graph K(m,n).
 * @author Georg Fischer
 */
public class A228312 extends BaseTriangle {

  /** Construct the sequence. */
  public A228312() {
    super(1, 1, 1);
  }

  @Override
  // T(m,n) = (3(m+n)^2 - 4mn - 3m - 3n)/2.
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf(n + k).square().multiply(3).subtract(4 * n * k).subtract(3 * n).subtract(3 * k).divide2();
  }
}
