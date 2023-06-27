package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082802 Smallest multiple of 7 beginning with n.
 * @author Sean A. Irvine
 */
public class A082802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082802() {
    super(1, new long[] {-1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0}, new long[] {14, 21, 35, 42, 56, 63, 7, 84, 91, 105, 112, 126, 133, 14});
  }
}
