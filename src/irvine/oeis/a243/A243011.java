package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243011 Sum of the three largest parts in the partitions of <code>4n</code> into 4 parts.
 * @author Sean A. Irvine
 */
public class A243011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243011() {
    super(new long[] {1, -3, 3, -3, 6, -6, 3, -3, 3}, new long[] {3, 34, 159, 489, 1161, 2365, 4336, 7323, 11640});
  }
}
