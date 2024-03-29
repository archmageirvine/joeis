package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A067997 Number of (unordered) ways of making change for n cents using coins of 1/2, 1, 2, 3, 5, 10, 20, 25, 50, 100 cents (all historical U.S.A. coinage denominations up to 100 cents).
 * @author Georg Fischer
 */
public class A067997 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067997() {
    super(0, new long[] {1},
      new long[] {1, -2, 0, 1, 1, -1, 0, 1, -1, -1, -1, 4, -1, -1, -1, 1, 0, 
      -1, 1, 1, -1, 0, 1, -1, -1, 0, 2, -1, 0, 0, 2, -4, 0, 2, 
      2, 0, -4, 2, 0, 0, -1, 2, 0, -1, -1, 1, 0, -1, 1, 1, -2, 
      2, 1, -2, -2, 0, 4, -2, 0, 0, 2, -4, 0, 2, 2, -1, -2, 2, 
      -1, -1, 1, 0, -1, 1, 1, 0, -2, 1, 0, 0, -2, 4, 0, -2, -2, 
      0, 4, -2, 0, 0, 1, -2, 0, 1, 1, -1, 0, 1, -1, -1, 0, 2, -1, 
      0, 0, 2, -4, 0, 2, 2, 0, -4, 2, 0, 0, -1, 2, 0, -1, -1, 1, 
      0, -1, 1, 1, 0, -2, 1, 0, 0, -2, 4, 0, -2, -2, 0, 4, -2, 
      0, 0, 1, -2, 0, 1, 1, -1, 0, 1, -1, -1, 2, -2, -1, 2, 2, 
      0, -4, 2, 0, 0, -2, 4, 0, -2, -2, 1, 2, -2, 1, 1, -1, 0, 
      1, -1, -1, 0, 2, -1, 0, 0, 2, -4, 0, 2, 2, 0, -4, 2, 0, 0, 
      -1, 2, 0, -1, -1, 1, 0, -1, 1, 1, -1, 0, 1, -1, -1, -1, 4, 
      -1, -1, -1, 1, 0, -1, 1, 1, 0, -2, 1});
  }
}
