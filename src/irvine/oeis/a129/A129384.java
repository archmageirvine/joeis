package irvine.oeis.a129;
// Generated by gen_seq4.pl partsum at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.PartialSumSequence;

/**
 * A129384 a(n) = Sum_{k=0..floor(n/2)} binomial(n-k, floor((n-k)/2)).
 * @author Georg Fischer
 */
public class A129384 extends PartialSumSequence {

  /** Construct the sequence. */
  public A129384() {
    super(new A129383());
  }
}
