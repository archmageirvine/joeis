package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049453.
 * @author Sean A. Irvine
 */
public class A049453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049453() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 26});
  }
}
