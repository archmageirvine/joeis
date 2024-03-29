package irvine.oeis.a329;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: (1+x^3)/(1-x)
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A329683 Number of excursions of length n with Motzkin-steps forbidding all consecutive steps of length 2 except UH, HH and HD.
 * @author Georg Fischer
 */
public class A329683 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A329683() {
    super(0, "[1,0,0,1]", "[1,-1]");
  }
}
