package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185782 Weight array of A185780, by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A185782 extends UpperLeftTriangle {

  /**
   * Construct the sequence.
   */
  public A185782() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n == 1 ? 2 * k - 1 : 2 * k - 2);
  }
}
