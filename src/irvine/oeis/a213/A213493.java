package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213493.
 * @author Sean A. Irvine
 */
public class A213493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213493() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 12, 48, 96, 204});
  }
}
