package irvine.oeis.a273;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A273790 Partial sums of the number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 931", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273790 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A273790() {
    super(0, new long[] {1, 2, 13, -12, 4},
      new long[] {1, -4, 6, -4, 1});
  }
}
