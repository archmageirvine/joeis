package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A172530 Number of ways to place 3 nonattacking knights on an n X n toroidal board.
 * @author Georg Fischer
 */
public class A172530 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172530() {
    super(1, new long[] {0, 0, 0, -6, -166, 730, -3210, 6650, -7942, 5978, -2850, 796, 
      -100},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
