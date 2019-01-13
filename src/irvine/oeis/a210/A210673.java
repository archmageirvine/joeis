package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210673.
 * @author Sean A. Irvine
 */
public class A210673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210673() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, -1, -1});
  }
}
