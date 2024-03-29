package irvine.oeis.a128;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A128473 Numbers of the form 30*k+23 or numbers that cannot be part of a twin prime pair.
 * @author Georg Fischer
 */
public class A128473 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A128473() {
    super(1, new long[] {0, 23, 7},
      new long[] {1, -2, 1});
  }
}
