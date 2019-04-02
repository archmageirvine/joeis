package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164470 Number of binary strings of length n with no substrings equal to 0001 0101 or 0111.
 * @author Sean A. Irvine
 */
public class A164470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164470() {
    super(new long[] {1, 0, -3, 2, -1, 2}, new long[] {13, 20, 32, 48, 69, 102});
  }
}
