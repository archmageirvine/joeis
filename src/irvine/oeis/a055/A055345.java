package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055345 Number of mobiles (circular rooted trees) with n nodes and 7 leaves.
 * @author Georg Fischer
 */
public class A055345 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055345() {
    super(8, A055278.computeRecurrence(7), "1, 7, 56, 318, 1408, 5207, 16772, 48410, 127661, 312172, 715827, 1552945, 3210066, 6359208, 12131129, 22374522, 40034564, 69695820, 118346132, 196435550, 319321325, 509215461, 797775355, 1229513719, 1866237409", 0);
  }
}

