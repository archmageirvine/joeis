package irvine.oeis.a255;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A255183 Third differences of ninth powers (A001017).
 * @author Georg Fischer
 */
public class A255183 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A255183() {
    super(0, new long[] {1, 502, 14608, 88234, 156190, 88234, 14608, 502, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
