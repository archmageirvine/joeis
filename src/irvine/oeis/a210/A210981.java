package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210981.
 * @author Sean A. Irvine
 */
public class A210981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210981() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 7, 11, 23});
  }
}
