package irvine.oeis.a238;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A238187 Gaussian norm of 1+(1+i)^n.
 * @author Georg Fischer
 */
public class A238187 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A238187() {
    super(0, new long[] {4, -15, 20, -10},
      new long[] {1, -5, 10, -10, 4});
  }
}
