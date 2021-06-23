package irvine.oeis.a162;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A162993 The second left hand column of triangle A162990.
 * Recurrence: a(n) = ((n+1)!/2)^2 for n&gt;=2
 * @author Georg Fischer
 */
public class A162993 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162993() {
    super(2, "[[0],[-1,-2,-1],[1]]", "[9]");
  }
}
