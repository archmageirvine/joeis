package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164454 Number of binary strings of length n with no substrings equal to 0001 0011 or 0101.
 * @author Sean A. Irvine
 */
public class A164454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164454() {
    super(new long[] {1, -1, 1, -3, 2, -1, 2}, new long[] {13, 21, 34, 52, 79, 120, 179});
  }
}
