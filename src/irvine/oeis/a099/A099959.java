package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A099959 Triangle read by rows: Each row is constructed by forming the partial sums of the previous row, reading from the right and at every other row repeating the final term.
 * reading from the right and at every other row repeating the final term.
 * @author Georg Fischer
 */
public class A099959 extends DoubleRowTriangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n <= 1) {
      return Z.ONE;
    }
    int lastCol = mHalf - 1;
    if ((n & 1) == 0) { // even rows
      if (k == mHalf) {
        return get(n, k - 1);
      }
    } else {
      ++lastCol;
    }
    Z sum = Z.ZERO;
    for (int m = lastCol - k; m <= lastCol; ++m) {
      sum = sum.add(get(n - 1, m));
    }
    return sum;
  }
}
