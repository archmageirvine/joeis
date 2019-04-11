package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238328 Sum of all the parts in the partitions of <code>4n</code> into 4 parts.
 * @author Sean A. Irvine
 */
public class A238328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238328() {
    super(new long[] {1, -3, 3, -3, 6, -6, 3, -3, 3}, new long[] {4, 40, 180, 544, 1280, 2592, 4732, 7968, 12636});
  }
}
