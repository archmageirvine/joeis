package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173731.
 * @author Sean A. Irvine
 */
public class A173731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173731() {
    super(new long[] {1, -11, 33, -33, 11}, new long[] {0, 0, 1, 11, 88});
  }
}
