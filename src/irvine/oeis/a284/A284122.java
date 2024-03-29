package irvine.oeis.a284;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A284122 Number of binary words w of length n for which s, the longest proper suffix of w that appears at least twice in w, is of length 1 (i.e., either s = 0 or s = 1).
 * @author Georg Fischer
 */
public class A284122 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A284122() {
    super(1, new long[] {0, 0, 2, -2, 0, -2},
      new long[] {1, -3, 2, 1, -1});
  }
}
