package irvine.oeis.a271;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A271004 Number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 245", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A271004 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A271004() {
    super(0, new long[] {1, 8, 1, 20, 4, 4, -3, -4, -3, 8, 0, -4},
      new long[] {1, 0, -3, 0, 3, 0, -1});
  }
}
