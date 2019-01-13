package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260918.
 * @author Sean A. Irvine
 */
public class A260918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260918() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 1, 5, 15, 33, 60, 100});
  }
}
