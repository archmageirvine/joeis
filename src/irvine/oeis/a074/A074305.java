package irvine.oeis.a074;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A074305 a(3m) = 2m, a(3m+1) = 4m+3, a(3m+2) = 4m+1.
 * @author Georg Fischer
 */
public class A074305 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A074305() {
    super(0, new long[] {0, 3, 1, 2, 1, 3},
      new long[] {1, 0, 0, -2, 0, 0, 1});
  }
}
