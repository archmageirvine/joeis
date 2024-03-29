package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A282998 Number of ways to place 6 points on a triangular grid of side n so that no two of them are adjacent.
 * @author Georg Fischer
 */
public class A282998 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A282998() {
    super(3, new long[] {0, 0, 0, 0, 0, 1, 340, 7720, 21439, -12927, -27265, 28385, -6252, 
      -116, -2365, 1787, -352},
      new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 
      13, -1});
  }
}
