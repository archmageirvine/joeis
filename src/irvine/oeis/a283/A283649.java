package irvine.oeis.a283;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A283649 Binary representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 705", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A283649 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A283649() {
    super(0, new long[] {1, -1, 11, 1000, -12000, 11000},
      new long[] {1, -1, -100, 100});
  }
}
