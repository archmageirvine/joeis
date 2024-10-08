package irvine.oeis.a161;
// Generated by gen_seq4.pl 2024-08-09.ack/lambdan at 2024-08-10 19:00

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A161563 Factorials of double factorials.
 * @author Georg Fischer
 */
public class A161563 extends LambdaSequence {

  /** Construct the sequence. */
  public A161563() {
    super(0, n -> Functions.FACTORIAL.z(Functions.MULTIFACTORIAL.z(2, n)));
  }
}
