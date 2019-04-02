package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008779 Number of n-dimensional partitions of 5.
 * @author Sean A. Irvine
 */
public class A008779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008779() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 24, 59, 120});
  }
}

