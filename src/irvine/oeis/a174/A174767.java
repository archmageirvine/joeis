package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174767 y-values in the solution to <code> x^2 -</code> 23*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A174767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174767() {
    super(new long[] {-1, 48}, new long[] {0, 5});
  }
}
