package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055336 Number of asymmetric (identity) trees with n nodes and 5 leaves.
 * @author Georg Fischer
 */
public class A055336 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055336() {
    super(6, A055278.computeRecurrence(5), "3, 10, 29, 65, 135, 252, 445, 739, 1184, 1821, 2726, 3963, 5643, 7861, 10770", 0);
  }
}

