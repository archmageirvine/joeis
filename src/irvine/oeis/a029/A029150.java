package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A029150 Expansion of 1/((1-x^2)(1-x^3)(1-x^6)(1-x^7)).
 * @author Georg Fischer
 */
public class A029150 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029150() {
    super(0, new long[] {1},
      new long[] {1, 0, -1, -1, 0, 1, -1, -1, 1, 2, 1, -1, -1, 1, 0, -1, -1, 
      0, 1});
  }
}
