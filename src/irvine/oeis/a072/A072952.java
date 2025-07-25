package irvine.oeis.a072;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A072952 Primes obtained as initial segments of the decimal expansion of the Euler-Mascheroni constant gamma = 0.5772... .
 *
 * @author Georg Fischer
 */
public class A072952 extends BriefSequence {

  /** Construct the sequence. */
  public A072952() {
    super(1, BRIEF, Z.FIVE, new Z("577"), new Z("5772156649015328606065120900824024310421"));
  }
}
