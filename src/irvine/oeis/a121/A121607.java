package irvine.oeis.a121;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A121607 (n^3+n)*3^n.
 * @author Georg Fischer
 */
public class A121607 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A121607() {
    super(1, new long[] {0, 6, 18, 54},
      new long[] {1, -12, 54, -108, 81});
  }
}
