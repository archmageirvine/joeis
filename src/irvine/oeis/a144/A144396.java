package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144396 The odd numbers greater than 1.
 * @author Sean A. Irvine
 */
public class A144396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144396() {
    super(1, new long[] {-1, 2}, new long[] {3, 5});
  }
}
