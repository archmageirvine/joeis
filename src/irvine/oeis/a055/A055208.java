package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A055208 Table T(n,k) = sum of k-th powers of digits of n read by antidiagonals (n &gt;= 1, k &gt;= 1).
 * @author Georg Fischer
 */
public class A055208 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A055208() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(int n, final int k) {
    Z sum = Z.ZERO;
    while (n > 0) {
      sum = sum.add(Z.valueOf(n % 10).pow(k));
      n /= 10;
    }
    return sum;
  }
}
