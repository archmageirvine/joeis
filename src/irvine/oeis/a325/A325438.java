package irvine.oeis.a325;
// Generated by gen_seq4.pl 2024-09-20.ack/filtpos at 2024-09-20 18:07

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002496;

/**
 * A325438 Indices of primes of the form k^2 + 1 ending in 1.
 * @author Georg Fischer
 */
public class A325438 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A325438() {
    super(1, 1, new A002496(), v -> v.mod(10) == 1);
  }
}
