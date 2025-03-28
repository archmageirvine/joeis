package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-03-02.ack/filter at 2025-03-02 23:03

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A380906 Primes avoiding the digits 3 and 5.
 * @author Georg Fischer
 */
public class A380906 extends FilterSequence {

  /** Construct the sequence. */
  public A380906() {
    super(1, new A000040(), v -> v.toString().matches("[0-246-9]+"));
  }
}
