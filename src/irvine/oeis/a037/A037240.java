package irvine.oeis.a037;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A037240 Molien series for 3-D group X1.
 * @author Georg Fischer
 */
public class A037240 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A037240() {
    super(0, new long[] {1, 0, 1, 3, 5, 1, 1},
      new long[] {1, -1, -3, 1, 5, 3, -6, -6, 3, 5, 1, -3, -1, 1});
  }
}
