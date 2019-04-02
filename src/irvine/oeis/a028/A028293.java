package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028293 Period 7.
 * @author Sean A. Irvine
 */
public class A028293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028293() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 1, 3, 1, 2, 1});
  }
}
