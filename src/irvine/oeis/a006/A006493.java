package irvine.oeis.a006;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A006493 Generalized Lucas numbers.
 * @author Georg Fischer
 */
public class A006493 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A006493() {
    super(3, "[0,-1,-5,-5, 10, 15,-11,-15, 10, 5,-5, 1]", "[1, 0, 6, 7, 28, 54, 135, 286, 627, 1313, 2730]", 0);
  }
}
