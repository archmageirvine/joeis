package irvine.oeis.a286;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A286438 Number of ways to tile an n X n X n triangular area with three 2 X 2 X 2 triangular tiles and an appropriate number (= n^2-12) of 1 X 1 X 1 tiles.
 * @author Georg Fischer
 */
public class A286438 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A286438() {
    super(3, new long[] {0, 0, 0, 0, 4, 35, 137, -28, -24, -15, 11},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
