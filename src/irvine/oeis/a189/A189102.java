package irvine.oeis.a189;
// Generated by gen_seq4.pl 2024-07-01/sintrif at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.oeis.a068.A068311;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A189102 Greatest common divisor of n! and its arithmetic derivative.
 * @author Georg Fischer
 */
public class A189102 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A189102() {
    super(1, (term, n) -> Functions.GCD.z(Functions.FACTORIAL.z(n), term), "", new A068311());
  }
}
