package irvine.oeis.a166;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A166977 Jacobsthal-Lucas numbers A014551, except a(0) = 0.
 * @author Georg Fischer
 */
public class A166977 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A166977() {
    super(0, new long[] {0, 1, 4},
      new long[] {1, -1, -2});
  }
}
