package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269549.
 * @author Sean A. Irvine
 */
public class A269549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269549() {
    super(new long[] {1, -99, 99}, new long[] {1, -199, -19799});
  }
}
