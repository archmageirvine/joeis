package irvine.oeis.a181;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A181493 Numbers of the form 3*2^k which are the average of twin primes, i.e., a(n)-1 and a(n)+1 are both prime.
 *
 * @author Georg Fischer
 */
public class A181493 extends BriefSequence {

  /** Construct the sequence. */
  public A181493() {
    super(1, BRIEF, Z.SIX, new Z("12"), new Z("192"), new Z("786432"));
  }
}
