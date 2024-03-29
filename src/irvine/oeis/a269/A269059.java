package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269059 Construct a hollow square of 1's of side n and fill its interior with 0's to create a stack of n binary numbers. Express the sum of the stack in decimal.
 * @author Georg Fischer
 */
public class A269059 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A269059() {
    super(1, new long[] {0, 1, 0, -4, 0, 4},
      new long[] {1, -6, 13, -12, 4});
  }
}
