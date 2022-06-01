package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239059 Sum of the two smallest parts from the partitions of 4n into 4 parts with smallest part = 1.
 * @author Sean A. Irvine
 */
public class A239059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239059() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {2, 9, 27, 61, 108, 178, 276, 395});
  }
}
