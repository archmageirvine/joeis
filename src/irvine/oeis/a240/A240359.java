package irvine.oeis.a240;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A240359 Number of n X 2 0..3 arrays with no element equal to one plus the sum of elements to its left or two plus the sum of elements above it or two plus the sum of the elements diagonally to its northwest, modulo 4.
 * @author Georg Fischer
 */
public class A240359 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A240359() {
    super(1, new long[] {0, 4, -21, 52, -72, 54, -8, -32, 55, -67, 66, -46, 20, -4},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
