package irvine.oeis.a103;
// manually 2023-06-24

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A103452 Inverse of number triangle A103451.
 * @author Georg Fischer
 */
public class A103452 extends BaseTriangle {

  /** Construct the sequence. */
  public A103452() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? Z.ONE : ((k == 0) ? Z.NEG_ONE : Z.ZERO);
  }
}

