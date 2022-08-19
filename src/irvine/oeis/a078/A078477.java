package irvine.oeis.a078;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A078477 Number of rational knots with n crossings and unknotting number = 1 (chiral pairs counted only once).
 * @author Georg Fischer
 */
public class A078477 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A078477() {
    super(3, "[0, 2, 0,-1, 0,-2, 0, 1]", "[1, 1, 1, 3, 3, 6, 7, 15]", 0);
  }
}
