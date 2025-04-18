package irvine.oeis.a147;
// Generated by gen_seq4.pl 2025-04-08.ack/lambdan at 2025-04-08 00:02

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a154.A154402;
import irvine.oeis.a353.A353786;

/**
 * A147645 Number of distinct Mersenne primes dividing n.
 * @author Georg Fischer
 */
public class A147645 extends LambdaSequence {

  private static final DirectSequence A154402 = new A154402();
  private static final DirectSequence A353786 = new A353786();

  /** Construct the sequence. */
  public A147645() {
    super(1, n -> A154402.a(n).subtract(A353786.a(n)));
  }
}
