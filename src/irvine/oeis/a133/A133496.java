package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133496.
 * @author Sean A. Irvine
 */
public class A133496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133496() {
    super(new long[] {1, -3, 3}, new long[] {0, 841, 3364});
  }
}
