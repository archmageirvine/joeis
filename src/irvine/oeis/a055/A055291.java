package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055291 Number of trees with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055291 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055291() {
    super(5, A055278.computeRecurrence(4), "1, 2, 4, 8, 14, 23, 36, 54, 78, 110", 0);
  }
}

