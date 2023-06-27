package irvine.oeis.a294;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A294286 Sum of the squares of the parts in the partitions of n into two distinct parts.
 * @author Sean A. Irvine
 */
public class A294286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294286() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 5, 10, 30, 46, 91});
  }
}
