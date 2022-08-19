package irvine.oeis.a002;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A002579 Number of integral points in a certain sequence of closed quadrilaterals.
 * @author Georg Fischer
 */
public class A002579 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A002579() {
    super(1, "[0, 1,-2, 1, 0, 0, 0,-1, 2,-1]", "3, 5, 8, 12, 17, 23, 30, 37");
  }
}
