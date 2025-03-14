package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a350.A350388;

/**
 * A380164 a(n) is the value of the Euler totient function when applied to the largest unitary divisor of n that is a square.
 * @author Georg Fischer
 */
public class A380164 extends LambdaSequence {

  private static final DirectSequence A350388 = new A350388();

  /** Construct the sequence. */
  public A380164() {
    super(1, n -> Functions.PHI.z(A350388.a(n)));
  }
}
