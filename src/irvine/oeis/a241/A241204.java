package irvine.oeis.a241;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A241204 Expansion of (1 + 2*x)^2/(1 - 2*x)^2.
 * @author Georg Fischer
 */
public class A241204 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A241204() {
    super(0, new long[] {1, 4, 4},
      new long[] {1, -4, 4});
  }
}
