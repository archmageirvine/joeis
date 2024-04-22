package irvine.oeis.a210;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A210619 Triangle of numbers with n 1's and n 0's in their representation in base of Fibonacci numbers (A014417).
 * @author Georg Fischer
 */
public class A210619 extends BaseTriangle {

  /** Construct the sequence. */
  public A210619() {
    super(1, 1, 1);
  }

  @Override
  // T(n,k) = Fibonacci(2*n+2) - Fibonacci(2*(n-k)) - 1.
  public Z triangleElement(final int n, final int k) {
    return Functions.FIBONACCI.z(2L * n + 2).subtract(Functions.FIBONACCI.z(2L * (n - k))).subtract(1);
  }
}
