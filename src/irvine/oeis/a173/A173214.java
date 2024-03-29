package irvine.oeis.a173;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A173214 Number of ways to place 4 nonattacking amazons (superqueens) on an n X n board.
 * @author Georg Fischer
 */
public class A173214 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A173214() {
    super(1, new long[] {0, 0, 0, 0, 0, -2, -106, -1416, -7718, -23432, -46502, -63114, 
      -60172, -37274, -11874, 2440, 4774, 2536, 522, -278, -324, -36, 
      56},
      new long[] {-1, 3, 1, -9, 0, 12, 7, -15, -16, 16, 15, -7, -12, 0, 9, -1, 
      -3, 1});
  }
}
