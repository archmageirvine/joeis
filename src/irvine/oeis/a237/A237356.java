package irvine.oeis.a237;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A237356 The number of tilings of the 3 X 4 X (2n) room with 1 X 2 X 2 boxes.
 * @author Georg Fischer
 */
public class A237356 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A237356() {
    super(0, new long[] {1, -26, 170, -364, 240},
      new long[] {1, -55, 700, -3186, 5180, -2640});
  }
}
