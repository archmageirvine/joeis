package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185916 Weight array of A185914, by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A185916 extends UpperLeftTriangle {

  /**
   * Construct the sequence.
   */
  public A185916() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n == 1 ? 1 : (n - 1 == k ? -1 : 0));
  }
}
