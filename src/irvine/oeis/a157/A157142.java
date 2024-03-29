package irvine.oeis.a157;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A157142 Signed denominators of Leibniz series for Pi/4.
 * @author Georg Fischer
 */
public class A157142 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A157142() {
    super(0, new long[] {1, -1},
      new long[] {1, 2, 1});
  }
}
