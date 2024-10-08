package irvine.oeis.a119;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A119702 a(n) = n^2*binomial(2*n, n)*Fibonacci(n).
 * @author Georg Fischer
 */
public class A119702 extends LambdaSequence {

  /** Construct the sequence. */
  public A119702() {
    super(0, n -> Z.valueOf(n).square().multiply(Binomial.binomial(2L * n, n)).multiply(Functions.FIBONACCI.z(n)));
  }
}
