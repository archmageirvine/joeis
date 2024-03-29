package irvine.oeis.a286;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A286445 Number of non-equivalent ways to tile an n X n X n triangular area with three 2 X 2 X 2 triangular tiles and an appropriate number (= n^2-12) of 1 X 1 X 1 tiles.
 * @author Georg Fischer
 */
public class A286445 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A286445() {
    super(3, new long[] {0, 0, 0, 0, 2, 8, 55, 121, 188, 121, 44, -39, -22, -5, 5, 2},
      new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3, -1});
  }
}
