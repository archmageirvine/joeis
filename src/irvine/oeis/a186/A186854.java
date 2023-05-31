package irvine.oeis.a186;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186854 Number of 5-step knight's tours on an (n+2) X (n+2) board summed over all starting positions.
 * @author Georg Fischer
 */
public class A186854 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186854() {
    super(1, "[[9904,-11224,2696],[-1]]", "16,400,2800,9328,21480", 0);
  }
}
