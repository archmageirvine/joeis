package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210675.
 * @author Sean A. Irvine
 */
public class A210675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210675() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 7, 15});
  }
}
