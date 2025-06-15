package irvine.oeis.a102;
// manually 2025-06-13/ratos at 2025-06-13 15:33

import irvine.oeis.recur.RationalRecurrence;

/**
 * A102556 Numerator of the probability that 2n-dimensional Gaussian random triangle has an obtuse angle.
 * @author Georg Fischer
 */
public class A102556 extends RationalRecurrence {

  /** Construct the sequence. */
  public A102556() {
    super(0, "[[0],[9,-6],[-17,14],[8,-8]]", "0,3/4,15/32", 0, 0);
    nextQ();
  }
}
