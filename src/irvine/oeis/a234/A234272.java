package irvine.oeis.a234;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234272 G.f.: (1+4*x+x^2)/(1-4*x+x^2).
 * @author Georg Fischer
 */
public class A234272 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A234272() {
    super(0, new long[] {1, 4, 1},
      new long[] {1, -4, 1});
  }
}
