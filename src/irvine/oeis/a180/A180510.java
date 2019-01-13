package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180510.
 * @author Sean A. Irvine
 */
public class A180510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180510() {
    super(new long[] {-1, -1, 2, 5, 2, -1}, new long[] {0, 1, 1, 2, 7, 5});
  }
}
