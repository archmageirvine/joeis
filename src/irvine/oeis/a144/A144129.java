package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144129.
 * @author Sean A. Irvine
 */
public class A144129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144129() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 26, 99});
  }
}
