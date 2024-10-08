package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-06.ack/lambdan at 2024-10-06 22:12

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001405;
import irvine.oeis.a350.A350388;

/**
 * A376553 Largest unitary square divisor of binomial(n, floor(n/2)).
 * @author Georg Fischer
 */
public class A376553 extends LambdaSequence {

  private static final DirectSequence A001405 = new A001405();
  private static final DirectSequence A350388 = new A350388();

  /** Construct the sequence. */
  public A376553() {
    super(0, n -> A350388.a(A001405.a(n)));
  }
}
