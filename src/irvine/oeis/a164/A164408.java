package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164408 Number of binary strings of length n with no substrings equal to 0000 0001 or 0011.
 * @author Sean A. Irvine
 */
public class A164408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164408() {
    super(new long[] {-1, 1, 1, 1}, new long[] {13, 23, 40, 68});
  }
}
