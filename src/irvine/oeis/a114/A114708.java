package irvine.oeis.a114;
// Generated by gen_seq4.pl 2025-06-01.ack/diffs at 2025-06-01 21:15

import irvine.oeis.DifferenceSequence;

/**
 * A114708 a(n) = A114707(n) - A114707(n-1) = the number of distinct primes dividing n but not A114707(n-1).
 * @author Georg Fischer
 */
public class A114708 extends DifferenceSequence {

  /** Construct the sequence. */
  public A114708() {
    super(2, new A114707());
  }
}
