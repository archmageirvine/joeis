package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111281 Number of permutations avoiding the patterns <code>{2413,2431,4213,3412,3421,4231,4321,4312};</code> number of strong sorting class based on 2413.
 * @author Sean A. Irvine
 */
public class A111281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111281() {
    super(new long[] {2, -2, 3}, new long[] {1, 2, 6});
  }
}
