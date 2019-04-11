package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164484 Number of binary strings of length n with no substrings equal to <code>0001 0111</code> or 1100.
 * @author Sean A. Irvine
 */
public class A164484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164484() {
    super(new long[] {2, -3, 0, 0, 2}, new long[] {13, 20, 31, 48, 74});
  }
}
