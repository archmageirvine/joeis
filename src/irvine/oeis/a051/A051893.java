package irvine.oeis.a051;
// manually 2021-05-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A051893 a(n) = Sum_{i=1..n-1} i^2*a(i), a(1) = 1.
 * @author Georg Fischer
 */
public class A051893 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051893() {
    super(1, "[[0],[2,-2, 1],[-1]", "1, 1, 5, 50", 0);
  }
}
