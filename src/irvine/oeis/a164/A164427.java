package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164427 Number of binary strings of length n with no substrings equal to 0000 0011 or 0110.
 * @author Sean A. Irvine
 */
public class A164427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164427() {
    super(new long[] {-1, 1, 0, 1, 1}, new long[] {13, 22, 37, 63, 105});
  }
}
