package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164416 Number of binary strings of length n with no substrings equal to <code>0000 0001</code> or 1111.
 * @author Sean A. Irvine
 */
public class A164416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164416() {
    super(new long[] {1, 2, 2, 1, 0}, new long[] {13, 23, 40, 69, 120});
  }
}
