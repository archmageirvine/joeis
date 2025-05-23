package irvine.oeis.a367;
// Generated by gen_seq4.pl 2025-04-20.ack/lambdan at 2025-04-20 22:06

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367556 Comma transform of the Fibonacci numbers.
 * @author Georg Fischer
 */
public class A367556 extends LambdaSequence {

  /** Construct the sequence. */
  public A367556() {
    super(0, n -> Functions.FIBONACCI.z(n).mod(Z.TEN).multiply(10).add(Functions.LEADING_DIGIT.z(Functions.FIBONACCI.z(n + 1))));
  }
}
