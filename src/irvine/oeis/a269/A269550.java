package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269550.
 * @author Sean A. Irvine
 */
public class A269550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269550() {
    super(new long[] {1, -99, 99}, new long[] {7, 465, 45347});
  }
}
