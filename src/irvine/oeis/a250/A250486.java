package irvine.oeis.a250;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A250486 A(n,k) is the n^k-th Fibonacci number; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A250486 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A250486() {
    super(0, 0, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Functions.FIBONACCI.z(Z.valueOf(n).pow(k));
  }
}
