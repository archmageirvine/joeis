package irvine.oeis.a353;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046386;

/**
 * A353022 Products of four distinct primes between twin primes.
 * @author Georg Fischer
 */
public class A353022 extends FilterSequence {

  /** Construct the sequence. */
  public A353022() {
    super(1, new A046386(), v -> Predicates.PRIME.is(v.add(1)) && Predicates.PRIME.is(v.subtract(1)));
  }
}
