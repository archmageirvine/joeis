package irvine.oeis.a107;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A107733 Column 2 of the array in A107735.
 * @author Georg Fischer
 */
public class A107733 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A107733() {
    super(3, new long[] {0, 0, 0, 1, 3, -4, -40, 0, 96, 0, -64},
      new long[] {1, 0, -17, 0, 80, 0, -128, 0, 64});
  }
}
