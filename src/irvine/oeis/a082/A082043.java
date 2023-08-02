package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A082043 Square array, A(n, k) = (k*n)^2 + 2*k*n + 1, read by antidiagonals.
 * @author Georg Fischer
 */
public class A082043 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A082043() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf((long) n * n).multiply((long) k * k).add(2L * n * k + 1);
  }
}
