package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164399.
 * @author Sean A. Irvine
 */
public class A164399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164399() {
    super(new long[] {-2, 2, -1, 2}, new long[] {14, 24, 41, 70});
  }
}
