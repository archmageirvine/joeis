package irvine.oeis.a328;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a327.A327860;

/**
 * A328392 Maximal digit value in primorial base expansion of A327860(n): a(n) = A328114(A327860(n)).
 * @author Georg Fischer
 */
public class A328392 extends LambdaSequence {

  private static final DirectSequence A327860 = new A327860();
  private static final DirectSequence A328114 = new A328114();

  /** Construct the sequence. */
  public A328392() {
    super(0, n -> A328114.a(A327860.a(n)));
  }
}
