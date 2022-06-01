package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055329 Number of rooted identity trees with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055329 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055329() {
    super(5, A055278.computeRecurrence(4), "2, 11, 40, 109, 254, 524, 998, 1774, 2995, 4833", 0);
  }
}

