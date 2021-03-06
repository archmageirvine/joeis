package irvine.oeis.a230;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A230179 Number of n X 3 0..2 arrays x(i,j) with each element horizontally or antidiagonally next to at least one element with value 2-x(i,j).
 * @author Georg Fischer
 */
public class A230179 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A230179() {
    super(1, new long[] {0, 3},
      new long[] {1, -9, 4});
  }
}
