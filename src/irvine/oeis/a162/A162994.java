package irvine.oeis.a162;
// manually 2021-06-23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A162994 The third left hand column of triangle A162990.
 * Recurrence: ((n+1)!/3)^2 for n&gt;=3
 * @author Georg Fischer
 */
public class A162994 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162994() {
    super(3, "[[0],[-1,-2,-1],[1]]", "[64]");
  }
}
