package irvine.oeis.a363;
// Generated by gen_seq4.pl 2025-02-13.ack/prepend at 2025-02-13 23:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a004.A004233;

/**
 * A363832 Number of digits left of the radix point of n when written in base e using a greedy algorithm representation.
 * @author Georg Fischer
 */
public class A363832 extends PrependSequence {

  /** Construct the sequence. */
  public A363832() {
    super(0, new A004233().skip(1), 1, 1);
  }
}
