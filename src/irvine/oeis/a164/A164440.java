package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164440 Number of binary strings of length n with no substrings equal to 0000 0110 or 1011.
 * @author Sean A. Irvine
 */
public class A164440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164440() {
    super(4, new long[] {1, -1, 1, -1, 2}, new long[] {13, 22, 37, 62, 104});
  }
}
