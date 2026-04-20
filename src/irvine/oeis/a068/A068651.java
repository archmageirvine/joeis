package irvine.oeis.a068;
// manually 2026-04-14

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A068651 Primes in which a string of 2's is sandwiched between two 9's.
 *
 * @author Georg Fischer
 */
public class A068651 extends BriefSequence {

  /** Construct the sequence. */
  public A068651() {
    super(1, BRIEF, new Z("929"), new Z("9222229"), new Z("9222222222229"),
      new Z("922222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222229"));
  }
}
