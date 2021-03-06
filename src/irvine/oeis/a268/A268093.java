package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A268093 Number of 1 X n 0..2 arrays with every repeated value in every row not one larger and in every column one larger mod 3 than the previous repeated value, and upper left element zero.
 * @author Georg Fischer
 */
public class A268093 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A268093() {
    super(1, new long[] {0, 1, -1, -1},
      new long[] {1, -4, 2, 4});
  }
}
