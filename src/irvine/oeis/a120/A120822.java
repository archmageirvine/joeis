package irvine.oeis.a120;
// Generated by gen_seq4.pl bref at 2020-11-27 17:17

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A120822 a(n) consecutive digits ascending beginning with the digit 4 give a prime.
 *
 * @author Georg Fischer
 */
public class A120822 extends BriefSequence {

  /** Construct the sequence. */
  public A120822() {
    super(1, BRIEF, Z.FOUR, Z.EIGHT, new Z("194"));
  }
}
