package irvine.oeis.a098;
// Generated by gen_seq4.pl 2025-03-28.ack/filnum at 2025-03-28 22:47

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A098463 Numbers k such that A055869(k) = (k+1)^k - k^k is prime.
 * @author Georg Fischer
 */
public class A098463 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A098463() {
    super(1, 0, k -> Predicates.PRIME.is(Z.valueOf(k + 1).pow(k).subtract(Z.valueOf(k).pow(k))));
  }
}
