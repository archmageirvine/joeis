package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A128229 A natural number transform, inverse of signed A094587.
 * @author Georg Fischer
 */
public class A128229 extends BaseTriangle {

  /** Construct the sequence. */
  public A128229() {
    super(1, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (n == k) ? Z.ONE : ((k == n - 1) ? Z.valueOf(n) : Z.ZERO);
  }
}
