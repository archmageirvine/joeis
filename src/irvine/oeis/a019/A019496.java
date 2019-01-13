package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019496.
 * @author Sean A. Irvine
 */
public class A019496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019496() {
    super(new long[] {2, -3, 0, 3}, new long[] {4, 11, 30, 81});
  }
}
