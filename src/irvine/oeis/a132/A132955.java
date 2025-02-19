package irvine.oeis.a132;
// Generated by gen_seq4.pl 2025-02-13.ack/prepend at 2025-02-13 23:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a073.A073887;

/**
 * A132955 Smallest prime in a sequence of n consecutive primes which add to a perfect square.
 * @author Georg Fischer
 */
public class A132955 extends PrependSequence {

  /** Construct the sequence. */
  public A132955() {
    super(2, new A073887().skip(2), 17);
  }
}
