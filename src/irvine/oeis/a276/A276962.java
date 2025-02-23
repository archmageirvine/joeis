package irvine.oeis.a276;
// Generated by gen_seq4.pl 2024-11-13.ack/filnum at 2024-11-13 22:27

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A276962 Numbers n such that n^17 - 1 is semiprime.
 * @author Georg Fischer
 */
public class A276962 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A276962() {
    super(1, 0, k -> Predicates.SEMIPRIME.is(Z.valueOf(k).pow(17).subtract(1)));
  }
}
