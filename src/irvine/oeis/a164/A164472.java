package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164472 Number of binary strings of length n with no substrings equal to 0001 0101 or 1010.
 * @author Sean A. Irvine
 */
public class A164472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164472() {
    super(4, new long[] {-1, 0, 0, 2, 0, 1}, new long[] {13, 22, 37, 61, 101, 167});
  }
}
