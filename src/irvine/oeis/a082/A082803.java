package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082803 Smallest multiple of 8 beginning with n.
 * @author Sean A. Irvine
 */
public class A082803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082803() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0}, new long[] {16, 24, 32, 40, 56, 64, 72, 8, 96, 104, 112, 120, 136, 144, 152, 16});
  }
}
