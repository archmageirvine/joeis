package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260644.
 * @author Sean A. Irvine
 */
public class A260644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260644() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 3, 2, 1});
  }
}
