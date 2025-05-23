package irvine.oeis.a111;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046034;

/**
 * A111483 Triangular numbers all of whose digits are primes.
 * @author Georg Fischer
 */
public class A111483 extends FilterSequence {

  /** Construct the sequence. */
  public A111483() {
    super(1, new A046034(), v -> Predicates.TRIANGULAR.is(v));
  }
}
