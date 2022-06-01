package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182788 Number of n-colorings of the Triangle Graph of order 3.
 * @author Sean A. Irvine
 */
public class A182788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182788() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 6, 192, 1620, 7680});
  }
}
