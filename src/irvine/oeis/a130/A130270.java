package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A130270 Triangle read by rows, T(n) followed by 1, 2, 3, ..., n-1.
 * @author Georg Fischer
 */
public class A130270 extends BaseTriangle {

  /** Construct the sequence. */
  public A130270() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf((k == 1) ? n * (n + 1) / 2 : k - 1);
  }
}
