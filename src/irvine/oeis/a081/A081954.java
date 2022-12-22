package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A081954 Triangle read by rows: T(n, k) = 2^(n-k)*3^k, n &gt;= 1, 0 &lt;= k &lt; n.
 * @author Georg Fischer
 */
public class A081954 extends BaseTriangle {

  /** Construct the sequence. */
  public A081954() {
    super(1, 1, 0);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.ONE.shiftLeft(n - k).multiply(Z.THREE.pow(k));
  }
}
