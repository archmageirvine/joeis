package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164421 Number of binary strings of length n with no substrings equal to 0000 0010 or 1001.
 * @author Sean A. Irvine
 */
public class A164421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164421() {
    super(4, new long[] {1, 0, 0, 1, 1}, new long[] {13, 22, 38, 65, 111});
  }
}
