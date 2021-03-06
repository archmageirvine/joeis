package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A282828 Decimal representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 521", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A282828 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A282828() {
    super(0, new long[] {1, 0, 0, 0, 6, 7, 14, -7, -152, 124, 216, -124, 152, 172, -96, 
      256, 0, -32},
      new long[] {1, 0, -1, 0, 0, 0, 0, 0, -256, 0, 256});
  }
}
