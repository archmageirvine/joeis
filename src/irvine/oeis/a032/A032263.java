package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032263 Number of ways to partition n labeled elements into 4 pie slices allowing the pie to be turned over; number of 2-element proper antichains of an n-element set.
 * @author Sean A. Irvine
 */
public class A032263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032263() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 0, 0, 3});
  }
}
