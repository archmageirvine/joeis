package irvine.oeis.a361;
// Generated by gen_seq4.pl 2025-02-22.ack/filnum at 2025-02-22 21:47

import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A361262 Numbers k such that k+i^2, i=0..6 are all semiprimes.
 * @author Georg Fischer
 */
public class A361262 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A361262() {
    super(1, 1, k -> Integers.SINGLETON.count(0, 6, i -> Predicates.SEMIPRIME.is(k + i * i)).equals(Z.SEVEN));
  }
}
