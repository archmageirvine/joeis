package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A128132 A natural number transform, companion to A127701.
 * @author Georg Fischer
 */
public class A128132 extends BaseTriangle {

  /** Construct the sequence. */
  public A128132() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.valueOf(n) : ((k == n - 1) ? Z.NEG_ONE : Z.ZERO);
  }
}
