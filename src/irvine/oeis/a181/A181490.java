package irvine.oeis.a181;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A181490 Numbers k such that 3*2^k-1 and 3*2^k+1 are twin primes (A001097).
 *
 * @author Georg Fischer
 */
public class A181490 extends BriefSequence {

  /** Construct the sequence. */
  public A181490() {
    super(1, BRIEF, Z.ONE, Z.TWO, Z.SIX, new Z("18"));
  }
}
