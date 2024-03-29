package irvine.oeis.a300;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A300292 Numbers k such that k^k + 9 is a prime.
 *
 * @author Georg Fischer
 */
public class A300292 extends BriefSequence {

  /** Construct the sequence. */
  public A300292() {
    super(1, BRIEF, Z.TWO, new Z("130"), new Z("140"));
  }
}
