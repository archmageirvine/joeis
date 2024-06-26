package irvine.oeis.a105;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A105472 Next-to-last digit of n-th Fibonacci number in decimal representation, a(n) = 0 for n &lt;= 6.
 * a(n) = (fibonacci(n) % 100)\10;
 * @author Georg Fischer
 */
public class A105472 extends LambdaSequence {

  /** Construct the sequence. */
  public A105472() {
    super(0, n -> Z.valueOf(Fibonacci.fibonacci(n, 100) / 10));
  }
}
