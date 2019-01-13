package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210677.
 * @author Sean A. Irvine
 */
public class A210677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210677() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 5, 10});
  }
}
