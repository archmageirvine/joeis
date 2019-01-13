package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226801.
 * @author Sean A. Irvine
 */
public class A226801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226801() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4683, 25988, 87135, 227304, 507035, 1014348, 1871583});
  }
}
