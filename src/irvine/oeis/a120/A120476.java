package irvine.oeis.a120;
// manually at 2023-07-12

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A120476 Triangle read by rows: a(n,m)=(2*n-1)*(n-m)*(n+m+1)/2, where n is the column and m the row index.
 * @author Georg Fischer
 */
public class A120476 extends BaseTriangle {

  /** Construct the sequence. */
  public A120476() {
    super(0, 1, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int m, final int n) {
    return Z.valueOf(2 * n - 1).multiply(n - m).multiply(n + m + 1).divide2();
  }
}
