package irvine.oeis.a301;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A301292 Partial sums of A301291.
 * @author Georg Fischer
 */
public class A301292 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A301292() {
    super(0, new long[] {1, 3, 1, 3, 1},
      new long[] {1, -3, 4, -4, 3, -1});
  }
}
