package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A082038 A square array of quadratic-factorial numbers, read by antidiagonals.
 * @author Georg Fischer
 */
public class A082038 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A082038() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Functions.FACTORIAL.z(n).multiply(Z.valueOf((long) n * n).multiply((long) k * k).add((long) n * k + 1));
  }
}
