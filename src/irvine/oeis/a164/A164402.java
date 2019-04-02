package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164402 Number of binary strings of length n with no substrings equal to 0010 or 0110.
 * @author Sean A. Irvine
 */
public class A164402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164402() {
    super(new long[] {2, -2, 0, 2}, new long[] {1, 2, 4, 8});
  }
}
