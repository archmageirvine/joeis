package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230239 Values of N for which the equation <code>x^2 - 4*y^2 =</code> N has integer solutions.
 * @author Sean A. Irvine
 */
public class A230239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230239() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 4, 5, 9, 12, 13, 16});
  }
}
