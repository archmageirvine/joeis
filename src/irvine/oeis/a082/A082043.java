package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A082043 A symmetric square array of numbers, read by antidiagonals.
 * @author Georg Fischer
 */
public class A082043 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A082043() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Z.valueOf(n * n).multiply(k * k).add(2 * n * k + 1);
  }
}
