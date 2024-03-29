package irvine.oeis.a341;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A341029 Twice the area of the convex hull around dragon curve expansion level n.
 * Lin.rec. signature: (3,-3, 3, 2,-12, 12,-12, 8)
 * @author Georg Fischer
 */
public class A341029 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A341029() {
    super(0, "[0, 8,-12, 12,-12, 2, 3,-3, 3,-1]", "0, 1, 3, 9, 23, 56, 121, 258, 539, 1118, 2273, 4614, 9323, 18806", 0);
  }
}
