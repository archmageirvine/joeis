package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055279 Number of rooted trees with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055279 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055279() {
    super(5, A055278.computeRecurrence(4), "1, 4, 14, 39, 97, 212, 429, 804, 1427, 2406", 0);
  }
}

