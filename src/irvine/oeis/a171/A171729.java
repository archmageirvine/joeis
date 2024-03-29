package irvine.oeis.a171;
// Generated by gen_seq4.pl 2023-08-09/trilamb at 2023-08-09 20:19

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A171729 Triangle of differences of Fibonacci numbers.
 * @author Georg Fischer
 */
public class A171729 extends LambdaTriangle {

  /** Construct the sequence. */
  public A171729() {
    super(1, 1, 1, (n, k) -> Fibonacci.fibonacci(n + 1).subtract((k == n) ? Z.ZERO : Fibonacci.fibonacci(n - k + 1)));
  }
}
