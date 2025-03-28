package irvine.oeis.a115;
// Generated by gen_seq4.pl 2025-03-25.ack/filnum at 2025-03-26 22:32

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A115913 Numbers k such that prime(k) - k is a brilliant number (A078972).
 * @author Georg Fischer
 */
public class A115913 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A115913() {
    super(1, 0, k -> Predicates.BRILLIANT.is(Functions.PRIME.z(k).subtract(k)));
  }
}
