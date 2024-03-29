package irvine.oeis.a139;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a047.A047393;

/**
 * A139591 A139275(n) followed by 18-gonal number A051870(n+1).
 * @author Sean A. Irvine
 */
public class A139591 extends PartialSumSequence {

  /** Construct the sequence. */
  public A139591() {
    super(new A047393());
  }
}
