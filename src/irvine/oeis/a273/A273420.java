package irvine.oeis.a273;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A273420 First differences of number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 705", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273420 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A273420() {
    super(0, new long[] {3, 14, 0, -3, 7, -5},
      new long[] {1, -1, -1, 1});
  }
}
