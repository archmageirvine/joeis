package irvine.oeis.a211;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A211012 Total area of all squares and rectangles after 2^n stages in the toothpick structure of A139250, assuming the toothpicks have length 2.
 * @author Georg Fischer
 */
public class A211012 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A211012() {
    super(0, new long[] {0, 0, 8},
      new long[] {1, -6, 8});
  }
}
