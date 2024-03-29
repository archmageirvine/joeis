package irvine.oeis.a190;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A190051 Expansion of (1-x)*(10*x^4-20*x^3+16*x^2-6*x+1)/(1-2*x)^5.
 * @author Georg Fischer
 */
public class A190051 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A190051() {
    super(0, new long[] {1, -7, 22, -36, 30, -10},
      new long[] {1, -10, 40, -80, 80, -32});
  }
}
