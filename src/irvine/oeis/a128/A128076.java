package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A128076 Triangle T(n,k) = 2*n-k, read by rows.
 * @author Georg Fischer
 */
public class A128076 extends BaseTriangle {

  /** Construct the sequence. */
  public A128076() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf(2L * n - k);
  }
}
