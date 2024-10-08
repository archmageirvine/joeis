package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-08.ack/filnum at 2024-10-08 23:52

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A376279 Numbers k such that k^k is a cube.
 * @author Georg Fischer
 */
public class A376279 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A376279() {
    super(1, 0, k -> Predicates.CUBE.is(Z.valueOf(k).pow(k)));
  }
}
