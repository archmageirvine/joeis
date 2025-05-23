package irvine.oeis.a268;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000051;

/**
 * A268212 Numbers n of the form 2^k + 1 such that n^2 - n - 1 is a prime q (for k &gt;= 0).
 * @author Georg Fischer
 */
public class A268212 extends FilterSequence {

  /** Construct the sequence. */
  public A268212() {
    super(1, new A000051(), v -> Predicates.PRIME.is(v.square().subtract(v).subtract(1)));
  }
}
