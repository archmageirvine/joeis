package irvine.oeis.a224;
// Generated by gen_seq4.pl 2025-02-13.ack/prepend at 2025-02-13 23:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a062.A062302;

/**
 * A224715 The number of unordered partitions {a,b} of prime(n) such that a or b is a nonnegative composite and the other is prime.
 * @author Georg Fischer
 */
public class A224715 extends PrependSequence {

  /** Construct the sequence. */
  public A224715() {
    super(1, new A062302().skip(2), 0, 0);
  }
}
