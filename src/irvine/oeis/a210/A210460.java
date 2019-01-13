package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210460.
 * @author Sean A. Irvine
 */
public class A210460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210460() {
    super(new long[] {1, 2, 2, 1}, new long[] {1, 2, 4, 10});
  }
}
