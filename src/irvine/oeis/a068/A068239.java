package irvine.oeis.a068;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A068239 1/2 the number of colorings of a 3 X 3 square array with n colors.
 * @author Georg Fischer
 */
public class A068239 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A068239() {
    super(2, new long[] {0, 0, 1, 113, 3621, 28765, 71075, 60099, 16567, 1199},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
