package irvine.oeis.a273;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A273619 Table read by antidiagonals (n&gt;1, k&gt;0): A(n,k) = leading digit of k in base n.
 * @author Georg Fischer
 */
public class A273619 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A273619() {
    super(2, 1, 1);
  }

  @Override
  public Z matrixElement(final int n, int k) {
    int result = 0;
    while (k > 0) {
      result = k;
      k /= n;
    }
    return Z.valueOf(result);
  }
}
