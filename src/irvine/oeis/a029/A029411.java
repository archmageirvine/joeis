package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A029411 Expansion of 1/((1-x^5)(1-x^9)(1-x^11)(1-x^12)).
 * @author Georg Fischer
 */
public class A029411 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029411() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, -1, -1, 0, 1, 0, 1, 1, 
      0, 0, 1, 1, 0, 1, 0, -1, -1, 0, -1, 0, 0, 0, -1, 0, 0, 0, 
      0, 1});
  }
}
