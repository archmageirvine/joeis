package irvine.oeis.a283;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A283589 Binary representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 657", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A283589 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A283589() {
    super(0, new long[] {1, -11, 111, -1, -90},
      new long[] {1, -11, 10});
  }
}
