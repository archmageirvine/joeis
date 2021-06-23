package irvine.oeis.a162;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A162991 The first right hand column of triangle A162990.
 * Recurrence: a(n) = ((n+1)!/n)^2 for n&gt;=1
 * @author Georg Fischer
 */
public class A162991 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162991() {
    super(1, "[[0],[-1, 0, 2, 0,-1],[0, 0, 1]]", "[4]");
  }
}
