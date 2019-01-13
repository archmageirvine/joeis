package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269548.
 * @author Sean A. Irvine
 */
public class A269548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269548() {
    super(new long[] {1, -99, 99}, new long[] {-1, -233, -22961});
  }
}
