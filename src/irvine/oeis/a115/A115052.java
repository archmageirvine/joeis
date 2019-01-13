package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115052.
 * @author Sean A. Irvine
 */
public class A115052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115052() {
    super(new long[] {-9, 18, -15, 6}, new long[] {1, 6, 21, 54});
  }
}
