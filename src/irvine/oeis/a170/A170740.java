package irvine.oeis.a170;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A170740 Expansion of g.f.: (1+x)/(1-20*x).
 * @author Georg Fischer
 */
public class A170740 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A170740() {
    super(0, new long[] {1, 1},
      new long[] {1, -20});
  }
}
