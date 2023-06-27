package irvine.oeis.a065;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A065495 Number of (binary) bit strings of length n in which an odd length block of 0's is followed by an odd length block of 1's.
 * @author Sean A. Irvine
 */
public class A065495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065495() {
    super(2, new long[] {-4, -2, 2, 2}, new long[] {1, 2, 6, 14});
  }
}
