package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A270012 Partial sums of the number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 7", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A270012 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A270012() {
    super(0, new long[] {1, 9, -3, 22, 3, 1, -1},
      new long[] {1, -1, -3, 3, 3, -3, -1, 1});
  }
}
