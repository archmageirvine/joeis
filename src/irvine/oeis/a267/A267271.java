package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267271 Decimal representation of the n-th iteration of the "Rule 115" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267271 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267271() {
    super(0, new long[] {1, 5, -13, -14, -52, -96, 64},
      new long[] {1, 0, -25, 0, 152, 0, -128});
  }
}
