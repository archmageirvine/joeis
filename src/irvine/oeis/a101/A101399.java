package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101399.
 * @author Sean A. Irvine
 */
public class A101399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101399() {
    super(new long[] {1, 2, 1}, new long[] {1, 2, 5});
  }
}
