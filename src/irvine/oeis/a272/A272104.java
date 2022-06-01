package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272104 Sum of the even numbers among the larger parts of the partitions of n into two parts.
 * @author Sean A. Irvine
 */
public class A272104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272104() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 0, 0, 2, 2, 4, 4, 10, 10});
  }
}
