package irvine.oeis.a070;
// manually fract21/trigf at 2023-05-27 19:57

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A070543 Triangular array read by rows: T(n,k) = number of k-dimensional isotropic subspaces of Spin(2n+1,C), n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A070543 extends BaseTriangle {

  /** Construct the sequence. */
  public A070543() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n, k) = k*(k+1)/2 + 2*k*(n-k) if 0 < k <= n.
    return Z.valueOf(k * (k + 1L) / 2).add(2L * k * (n - k));
  }
}
