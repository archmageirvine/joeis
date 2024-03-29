package irvine.oeis.a302;
// Generated by gen_seq4.pl partsum at 2021-05-28 22:45
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a006.A006906;

/**
 * A302830 Expansion of (1/(1 - x))*Product_{k&gt;=1} 1/(1 - k*x^k).
 *
 * @author Georg Fischer
 */
public class A302830 extends PartialSumSequence {

  /** Construct the sequence. */
  public A302830() {
    super(new A006906());
  }
}
