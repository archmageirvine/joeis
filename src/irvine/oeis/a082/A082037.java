package irvine.oeis.a082;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A082037 A square array of linear-factorial numbers, read by antidiagonals.
 * @author Georg Fischer
 */
public class A082037 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A082037() {
    super(0, 0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return MemoryFactorial.SINGLETON.factorial(n).multiply(n * k + 1);
  }
}
