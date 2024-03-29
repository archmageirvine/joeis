package irvine.oeis.a117;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A117691 Expansion of (4+3*x+3*x^2+2*x^3-x^5-x^6-x^7)/(1-x^4)^2.
 * @author Georg Fischer
 */
public class A117691 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A117691() {
    super(0, new long[] {4, 3, 3, 2, 0, -1, -1, -1},
      new long[] {1, 0, 0, 0, -2, 0, 0, 0, 1});
  }
}
