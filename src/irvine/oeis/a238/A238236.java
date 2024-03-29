package irvine.oeis.a238;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A238236 Expansion of (1-x-x^2)/((x-1)*(x^3+3*x^2+2*x-1)).
 * @author Georg Fischer
 */
public class A238236 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A238236() {
    super(0, new long[] {1, -1, -1},
      new long[] {1, -3, -1, 2, 1});
  }
}
