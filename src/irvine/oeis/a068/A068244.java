package irvine.oeis.a068;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A068244 1/6 the number of colorings of a 3 X 3 rhombic- or staggered- hexagonal array with n colors.
 * @author Georg Fischer
 */
public class A068244 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A068244() {
    super(3, new long[] {0, 0, 0, 1, 166, 3775, 18500, 26015, 10934, 1089},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
