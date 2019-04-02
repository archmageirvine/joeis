package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164392 Number of binary strings of length n with no substrings equal to 0001 or 0010.
 * @author Sean A. Irvine
 */
public class A164392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164392() {
    super(new long[] {-1, 1, -1, 0, 2}, new long[] {1, 2, 4, 8, 14});
  }
}
