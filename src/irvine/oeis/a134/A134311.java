package irvine.oeis.a134;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A134311 Row sums of triangle A134310.
 * @author Georg Fischer
 */
public class A134311 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A134311() {
    super(1, "[0, 4,-12, 13,-6, 1]", "[1, 2, 7, 20, 51, 122]", 0);
  }
}
