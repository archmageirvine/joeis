package irvine.oeis.a102;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A102561 2^floor(n/2)((-1)^floor(n/2)+(-1)^n)/2.
 * Recurrence: a(n-4) - a(n) = 0.
 * @author Georg Fischer
 */
public class A102561 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102561() {
    super(0, "[[0],[4],[0],[0],[0],[-1]]", "[1, 0, 0,-2]", 0);
  }
}
