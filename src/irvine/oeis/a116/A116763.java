package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A116763 Number of permutations of length n which avoid the patterns 2134, 3241, 3421.
 * @author Georg Fischer
 */
public class A116763 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116763() {
    super(1, new long[] {0, 1, -8, 27, -45, 39, -18, 2},
      new long[] {1, -10, 41, -88, 104, -64, 16});
  }
}
