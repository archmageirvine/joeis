package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082801 Smallest multiple of 6 beginning with n.
 * @author Sean A. Irvine
 */
public class A082801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082801() {
    super(1, new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {12, 24, 30, 42, 54, 6, 72, 84, 90, 102, 114, 12});
  }
}
