package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164407 Number of binary strings of length n with no substrings equal to 0000 0001 or 0010.
 * @author Sean A. Irvine
 */
public class A164407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164407() {
    super(new long[] {1, 0, 1, 1}, new long[] {13, 23, 40, 71});
  }
}
