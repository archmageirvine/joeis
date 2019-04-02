package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188765 Number of binary strings of length n with no substrings equal to 00000 or 00100.
 * @author Sean A. Irvine
 */
public class A188765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188765() {
    super(new long[] {1, 2, 2, 1, 0, 1, 1}, new long[] {1, 2, 4, 8, 16, 30, 57});
  }
}
