package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164395 Number of binary strings of length n with no substrings equal to 0001 or 0101.
 * @author Sean A. Irvine
 */
public class A164395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164395() {
    super(new long[] {-2, 2, -1, 2}, new long[] {1, 2, 4, 8});
  }
}
