package irvine.oeis.a097;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A097116 Expansion of (1-x)/((1-x)^2-3x^3).
 * @author Georg Fischer
 */
public class A097116 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A097116() {
    super(0, new long[] {1, -1},
      new long[] {1, -2, 1, -3});
  }
}
