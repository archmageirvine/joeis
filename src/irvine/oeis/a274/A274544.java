package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274544 Values of k such that 2*k-1 and 5*k-1 are both perfect squares.
 * @author Sean A. Irvine
 */
public class A274544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274544() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 13, 925, 18241, 1333345});
  }
}
