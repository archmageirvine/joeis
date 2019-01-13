package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144677.
 * @author Sean A. Irvine
 */
public class A144677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144677() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 2, 3, 6, 9, 12, 18, 24});
  }
}
