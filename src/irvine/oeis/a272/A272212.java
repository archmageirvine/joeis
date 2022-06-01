package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272212 Sum of the odd numbers among the larger parts of the partitions of n into two parts.
 * @author Sean A. Irvine
 */
public class A272212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272212() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 0, 1, 0, 3, 3, 8, 5, 12});
  }
}
