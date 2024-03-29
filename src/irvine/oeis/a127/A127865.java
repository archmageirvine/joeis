package irvine.oeis.a127;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A127865 Number of square tiles in all tilings of a 2 X n board with 1 X 1 and L-shaped tiles (where the L-shaped tiles cover 3 squares).
 * @author Georg Fischer
 */
public class A127865 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A127865() {
    super(1, new long[] {0, 2, 4},
      new long[] {1, -2, -7, 4, 20, 16, 4});
  }
}
