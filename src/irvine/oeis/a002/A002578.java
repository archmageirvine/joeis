package irvine.oeis.a002;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A002578 Number of integral points in a certain sequence of open quadrilaterals.
 * @author Georg Fischer
 */
public class A002578 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A002578() {
    super(1, "[0, 1,-2, 1, 0, 0, 0,-1, 2,-1]", "0, 0, 1, 3, 6, 9, 13, 18");
  }
}
