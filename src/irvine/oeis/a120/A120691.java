package irvine.oeis.a120;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A120691 First differences of coefficients in the continued fraction for e.
 * @author Georg Fischer
 */
public class A120691 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A120691() {
    super(0, new long[] {2, -1, 1, -5, 2, 1, 1, -1},
      new long[] {1, 0, 0, -2, 0, 0, 1});
  }
}
