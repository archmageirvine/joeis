package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164491 Number of binary strings of length n with no substrings equal to 0010 0100 or 1001.
 * @author Sean A. Irvine
 */
public class A164491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164491() {
    super(new long[] {1, 1, 0, 0, 1, 1}, new long[] {13, 23, 40, 70, 122, 213});
  }
}
