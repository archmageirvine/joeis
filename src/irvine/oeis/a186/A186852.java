package irvine.oeis.a186;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186852 Number of 3-step knight&apos;s tours on an (n+2) X (n+2) board summed over all starting positions.
 * @author Georg Fischer
 */
public class A186852 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186852() {
    super(1, "[[-8,-56,56],[-1]]", "16", 0);
  }
}
