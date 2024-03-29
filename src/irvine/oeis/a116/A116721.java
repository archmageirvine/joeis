package irvine.oeis.a116;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A116721 Number of permutations of length n which avoid the patterns 123, 3142, 4312; or avoid the patterns 123, 3421, 4231.
 * @author Georg Fischer
 */
public class A116721 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A116721() {
    super(1, new long[] {0, 1, -2, 3, 0, -1},
      new long[] {1, -4, 6, -4, 1});
  }
}
