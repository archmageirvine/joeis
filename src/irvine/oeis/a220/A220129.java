package irvine.oeis.a220;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220129 1 followed by period 12: (1, 5, 3, 9, 1, 7, 1, 9, 3, 5, 1, 11) repeated; offset 0.
 * @author Georg Fischer
 */
public class A220129 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A220129() {
    super(0, new long[] {-1, -2, -7, -9, -16, -11, -10},
      new long[] {-1, -1, -1, 0, 1, 1, 1});
  }
}
