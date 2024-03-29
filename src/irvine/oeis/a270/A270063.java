package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A270063 Number of tilings of a 3 X n rectangle using monominoes and trominoes of any shape.
 * @author Georg Fischer
 */
public class A270063 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A270063() {
    super(0, new long[] {1, -2, -2, -16, 0, 13, 21, -24, -11, -12, 21, 7, 4, -5, -2, 
      -1},
      new long[] {1, -4, -8, -37, -32, -11, -17, -110, -40, 21, 147, 46, 32, -54, 
      -21, -9, 5, 2, 1});
  }
}
