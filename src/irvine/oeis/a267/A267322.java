package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267322.
 * @author Sean A. Irvine
 */
public class A267322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267322() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 1, 1, 3, 4, 5, 6, 9, 12});
  }
}
