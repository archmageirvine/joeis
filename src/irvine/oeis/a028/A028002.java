package irvine.oeis.a028;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A028002 Expansion of 1/((1-2*x)*(1-6*x)*(1-10*x)*(1-11*x)).
 * @author Georg Fischer
 */
public class A028002 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A028002() {
    super(0, new long[] {1},
      new long[] {1, -29, 290, -1132, 1320});
  }
}
