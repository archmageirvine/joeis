package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212969.
 * @author Sean A. Irvine
 */
public class A212969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212969() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 2, 10, 26, 56});
  }
}
