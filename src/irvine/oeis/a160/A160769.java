package irvine.oeis.a160;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A160769 G.f.: (21+101*x+97*x^2+22*x^3+x^4)/(1-x)^5.
 * @author Georg Fischer
 */
public class A160769 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A160769() {
    super(0, new long[] {21, 101, 97, 22, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
