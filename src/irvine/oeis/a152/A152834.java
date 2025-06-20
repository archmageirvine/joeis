package irvine.oeis.a152;
// Generated by gen_seq4.pl 2024-10-25.ack/filnum at 2024-10-25 23:02

import irvine.oeis.FilterNumberSequence;

/**
 * A152834 Numbers of the form 6*k+1 that use only digits 2 and 3.
 * @author Georg Fischer
 */
public class A152834 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A152834() {
    super(1, 0, k -> k % 6 == 1 && Integer.toString(k).matches("[23]+"));
  }
}
