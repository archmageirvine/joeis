package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267831.
 * @author Sean A. Irvine
 */
public class A267831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267831() {
    super(new long[] {1, -1, 2, -2, 1}, new long[] {1, 6, -3, -16, 1});
  }
}
