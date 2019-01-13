package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115360.
 * @author Sean A. Irvine
 */
public class A115360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115360() {
    super(new long[] {1, 1, 0, -1}, new long[] {1, -1, 1, 0});
  }
}
