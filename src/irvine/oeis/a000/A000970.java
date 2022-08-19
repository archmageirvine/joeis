package irvine.oeis.a000;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A000970 Fermat coefficients.
 * @author Georg Fischer
 */
public class A000970 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A000970() {
    super(5, "[0,-1, 4,-6, 4,-1, 1,-4, 6,-4, 1]", "[1, 7, 25, 66, 143, 273]");
  }
}
