package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006094;

/**
 * A354682 Interprimes that are products of two successive primes.
 * @author Georg Fischer
 */
public class A354682 extends FilterSequence {

  /** Construct the sequence. */
  public A354682() {
    super(1, new A006094(), v -> v.subtract(Functions.PREV_PRIME.z(v)).equals(Functions.NEXT_PRIME.z(v).subtract(v)));
  }
}
