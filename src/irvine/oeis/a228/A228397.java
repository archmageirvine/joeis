package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228397 The number of permutations of length n sortable by 3 reversals.
 * @author Georg Fischer
 */
public class A228397 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A228397() {
    super(1, new long[] {0, -1, 5, -13, 11, -41, -51, 74, -12, -5, -2},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
