package irvine.oeis.a103;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A103516 Triangle read by rows: count in a vee.
 * @author Georg Fischer
 */
public class A103516 extends BaseTriangle {

  /** Construct the sequence. */
  public A103516() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n || k == 1) ? Z.valueOf(n) : Z.ZERO;
  }
}

