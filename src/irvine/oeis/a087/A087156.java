package irvine.oeis.a087;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A087156 Nonnegative numbers excluding 1.
 * @author Georg Fischer
 */
public class A087156 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A087156() {
    super(1, new long[] {0, 0, 2, -1},
      new long[] {1, -2, 1});
  }
}
