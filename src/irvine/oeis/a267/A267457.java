package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267457 Decimal representation of the n-th iteration of the "Rule 133" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267457 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267457() {
    super(0, new long[] {1, 2, -13, -26, 32, 64},
      new long[] {1, 0, -17, 0, 16});
  }
}
