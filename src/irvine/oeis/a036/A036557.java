package irvine.oeis.a036;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A036557 Number of multiples of 3 in 0..2^n-1 with an even sum of base-2 digits.
 * @author Georg Fischer
 */
public class A036557 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A036557() {
    super(0, new long[] {1, -1, -4, 3, 3, -1},
      new long[] {1, -2, -4, 8, 3, -6});
  }
}
