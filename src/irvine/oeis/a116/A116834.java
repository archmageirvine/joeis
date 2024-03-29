package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A116834 Number of permutations of length n which avoid the patterns 1234, 2431, 3421.
 * @author Georg Fischer
 */
public class A116834 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116834() {
    super(1, new long[] {0, -1, 3, -6, -1, -13, -16, -1},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
