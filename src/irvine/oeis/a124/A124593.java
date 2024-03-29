package irvine.oeis.a124;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A124593 Number of 4-indecomposable trees with n nodes.
 * @author Georg Fischer
 */
public class A124593 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A124593() {
    super(0, "[0, 1,-1,-1,-1, 2, 2,-1,-1,-1, 1]", "[1, 1, 1, 1, 2, 3, 6, 11, 13, 17, 23, 27, 33, 42, 48, 57]", 0);
  }
}
