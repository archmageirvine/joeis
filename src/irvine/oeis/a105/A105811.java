package irvine.oeis.a105;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A105811 Expansion of g.f. (1+x-x^2)/(1+x)^2.
 * @author Georg Fischer
 */
public class A105811 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A105811() {
    super(0, new long[] {1, 1, -1},
      new long[] {1, 2, 1});
  }
}
