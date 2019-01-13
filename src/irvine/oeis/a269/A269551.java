package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269551.
 * @author Sean A. Irvine
 */
public class A269551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269551() {
    super(new long[] {1, -99, 99}, new long[] {5, 237, 22965});
  }
}
