package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164434.
 * @author Sean A. Irvine
 */
public class A164434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164434() {
    super(new long[] {-1, -1, 0, 1, 2, 0, 1}, new long[] {13, 23, 40, 70, 122, 213, 372});
  }
}
