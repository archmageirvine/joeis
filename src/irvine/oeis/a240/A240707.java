package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240707 Sum of the middle parts in the partitions of 4n-1 into 3 parts.
 * @author Sean A. Irvine
 */
public class A240707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240707() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 8, 31, 80, 159, 282, 459, 690});
  }
}
