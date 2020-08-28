package irvine.oeis.a302;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001156;

/**
 * A302833 Expansion of (1/(1 - x))*Product_{k&gt;=1} 1/(1 - x^(k^2)).
 * @author Georg Fischer
 */
public class A302833 extends PartialSumSequence {

  /** Construct the sequence. */
  public A302833() {
    super(new A001156());
  }
}
