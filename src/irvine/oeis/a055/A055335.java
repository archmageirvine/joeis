package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055335 Number of asymmetric (identity) trees with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055335 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055335() {
    super(9, A055278.computeRecurrence(4), "1, 3, 8, 14, 25, 40, 62, 89, 127, 173", 0);
  }
}

