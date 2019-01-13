package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228394.
 * @author Sean A. Irvine
 */
public class A228394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228394() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 6, 21, 61});
  }
}
