package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-11-13.ack/filnum at 2024-11-13 22:27

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A243436 Numbers n such that n^2-n-1 is semiprime.
 * @author Georg Fischer
 */
public class A243436 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A243436() {
    super(1, 0, k -> Predicates.SEMIPRIME.is(Z.valueOf(k).square().subtract(k + 1)));
  }
}
