package irvine.oeis.a058;
// manually 

import irvine.oeis.HolonomicRecurrence;

/**
 * A058798 a(n) = n*a(n-1) - a(n-2) with a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A058798 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A058798() {
    super(0, "[[0],[-1],[0, 1],[-1]]", "[0, 1]", 0);
  }
}
