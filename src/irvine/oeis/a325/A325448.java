package irvine.oeis.a325;
// Generated by gen_seq4.pl 2025-06-03.ack/filter at 2025-06-03 20:14

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A325448 Fibonacci numbers whose decimal expansion contains the digit 1.
 * @author Georg Fischer
 */
public class A325448 extends FilterSequence {

  /** Construct the sequence. */
  public A325448() {
    super(1, new A000045().skip(2), v -> v.toString(10).indexOf('1') >= 0);
  }
}
