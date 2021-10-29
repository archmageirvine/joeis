package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185870 (Even,odd)-polka dot array in the natural number array A000027, by antidiagonals.
 * T(n,k) = 2*n + (n+k-1)*(2*n+2*k-3), k&gt;=1, n&gt;=1.
 *
 * @author Georg Fischer
 */
public class A185870 extends UpperLeftTriangle {

  /**
   * Construct the sequence.
   */
  public A185870() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n + k - 1).multiply(2 * n + 2 * k - 3).add(2 * n);
  }
}
