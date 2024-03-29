package irvine.oeis.a268;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A268067 Numbers k such that 1 + 2^k + 3^k + 5^k is prime.
 *
 * @author Georg Fischer
 */
public class A268067 extends BriefSequence {

  /** Construct the sequence. */
  public A268067() {
    super(1, BRIEF, Z.ONE, new Z("17"), new Z("1295"));
  }
}
