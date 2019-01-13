package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086640.
 * @author Sean A. Irvine
 */
public class A086640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086640() {
    super(new long[] {1, -3, 3}, new long[] {7, 30, 71});
  }
}
