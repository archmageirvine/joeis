package irvine.oeis.a086;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A086443 Expansion of x^2/((1-4*x)*(1-3*x)^2).
 * @author Georg Fischer
 */
public class A086443 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A086443() {
    super(0, new long[] {0, 0, 1},
      new long[] {1, -10, 33, -36});
  }
}
