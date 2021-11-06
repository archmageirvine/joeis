package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185871 (Even,even)-polka dot array in the natural number array A000027, by antidiagonals.
 * T(n,k) = 2*n + (n+k-1)*(2*n+2*k-1), k&gt;=1, n&gt;=1.
 *
 * @author Georg Fischer
 */
public class A185871 extends UpperLeftTriangle {

  /**
   * Construct the sequence.
   */
  public A185871() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n + k - 1).multiply(2L * n + 2L * k - 1).add(2L * n);
  }
}
