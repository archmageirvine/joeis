package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144396 The odd numbers greater than 1.
 * @author Sean A. Irvine
 */
public class A144396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144396() {
    super(new long[] {-1, 2}, new long[] {3, 5});
  }
}
