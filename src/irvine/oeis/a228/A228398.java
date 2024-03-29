package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228398 The number of permutations of length n sortable by 3 prefix reversals (in the pancake sorting sense).
 * @author Georg Fischer
 */
public class A228398 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A228398() {
    super(1, new long[] {0, 1, -2, 4, 5, -3, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
