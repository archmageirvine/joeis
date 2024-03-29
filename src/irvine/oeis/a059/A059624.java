package irvine.oeis.a059;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A059624 Expansion of (3+10*x+3*x^2)/(1-x)^12.
 * @author Georg Fischer
 */
public class A059624 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A059624() {
    super(0, new long[] {3, 10, 3},
      new long[] {1, -12, 66, -220, 495, -792, 924, -792, 495, -220, 66, -12, 1});
  }
}
