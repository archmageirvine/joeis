package irvine.oeis.a002;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A002789 Number of integer points in a certain quadrilateral scaled by a factor of n.
 * @author Georg Fischer
 */
public class A002789 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A002789() {
    super(1, "[0,-1, 1, 1, 0,-1,-1, 1]", "[2, 4, 7]", 0);
  }
}
