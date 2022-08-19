package irvine.oeis.a006;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A006492 Generalized Lucas numbers.
 * @author Georg Fischer
 */
public class A006492 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A006492() {
    super(3, "[0, 1, 4, 2,-8,-5, 8, 2,-4, 1]", "[1, 0, 5, 6, 21, 40, 93, 190, 396]", 0);
  }
}
