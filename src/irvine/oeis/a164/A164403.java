package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164403 Number of binary strings of length n with no substrings equal to 0010 or 1001.
 * @author Sean A. Irvine
 */
public class A164403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164403() {
    super(new long[] {1, 0, -1, 0, 2}, new long[] {14, 25, 45, 80, 143});
  }
}
