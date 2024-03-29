package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228306 The Wiener index of the Kneser graph K(n,2) (n&gt;=5).
 * @author Georg Fischer
 */
public class A228306 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A228306() {
    super(5, new long[] {0, 0, 0, 0, 0, 75, -210, 240, -129, 27},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
