package irvine.oeis.a157;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A157438 Primes p such that p^2 divides A085606((p-1)/2) = ((p-1)/2-1)^((p-1)/2) - 1.
 *
 * @author Georg Fischer
 */
public class A157438 extends BriefSequence {

  /** Construct the sequence. */
  public A157438() {
    super(1, BRIEF, Z.FIVE, new Z("127"), new Z("607"));
  }
}
