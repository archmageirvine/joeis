package irvine.oeis.a303;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002095;

/**
 * A303663 Expansion of (1/(1 - x))*Product_{k&gt;=1} (1 - x^prime(k))/(1 - x^k).
 * @author Georg Fischer
 */
public class A303663 extends PartialSumSequence {

  /** Construct the sequence. */
  public A303663() {
    super(new A002095());
  }
}
