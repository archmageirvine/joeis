package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210428.
 * @author Sean A. Irvine
 */
public class A210428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210428() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 16, 119, 560, 1955, 5552});
  }
}
