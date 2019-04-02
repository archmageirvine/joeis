package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164417 Number of binary strings of length n with no substrings equal to 0000, 0010, or 0100.
 * @author Sean A. Irvine
 */
public class A164417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164417() {
    super(new long[] {-1, -1, 1, 1, 0, 1, 1}, new long[] {1, 2, 4, 8, 13, 22, 39});
  }
}
