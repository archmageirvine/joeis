package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164469 Number of binary strings of length n with no substrings equal to 0001 0101 or 0110.
 * @author Sean A. Irvine
 */
public class A164469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164469() {
    super(4, new long[] {-1, 1, -1, 1, -1, 2}, new long[] {13, 20, 32, 51, 81, 128});
  }
}
