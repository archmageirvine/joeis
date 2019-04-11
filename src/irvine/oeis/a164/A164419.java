package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164419 Number of binary strings of length n with no substrings equal to <code>0000, 0010,</code> or 0110.
 * @author Sean A. Irvine
 */
public class A164419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164419() {
    super(new long[] {1, 1, 1, -1, 1, 1}, new long[] {1, 2, 4, 8, 13, 21});
  }
}
