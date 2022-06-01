package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164506 Number of binary strings of length n with no substrings equal to 0011 0110 or 1001.
 * @author Sean A. Irvine
 */
public class A164506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164506() {
    super(new long[] {-2, 3, -2, 0, 2}, new long[] {13, 22, 37, 62, 104});
  }
}
