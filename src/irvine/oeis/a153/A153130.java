package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153130.
 * @author Sean A. Irvine
 */
public class A153130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153130() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 2, 4, 8});
  }
}
