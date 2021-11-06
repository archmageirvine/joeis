package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185869 (Odd,even)-polka dot array in the natural number array A000027; read by antidiagonals.
 * <code>T(n,k) = 2n-1+(n+k-1)*(2n+2k-3), k&gt;=1, n&gt;=1.</code>
 *
 * @author Georg Fischer
 */
public class A185869 extends UpperLeftTriangle {

  /**
   * Construct the sequence.
   */
  public A185869() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n + k - 1).multiply(2 * n + 2 * k - 3).add(2 * n - 1);
  }
}
