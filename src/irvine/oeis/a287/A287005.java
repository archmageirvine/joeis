package irvine.oeis.a287;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A287005 Number of connected dominating sets on the n-Moebius ladder.
 * @author Georg Fischer
 */
public class A287005 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A287005() {
    super(1, "[0,-1,-2,5,4,-11,6,-1]", "9,13,49,129,361,989", 0);
  }
}
