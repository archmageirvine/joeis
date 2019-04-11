package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164447 Number of binary strings of length n with no substrings equal to <code>0001 0010</code> or 0110.
 * @author Sean A. Irvine
 */
public class A164447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164447() {
    super(new long[] {-1, 0, 2, -2, 0, 2}, new long[] {13, 21, 33, 54, 88, 144});
  }
}
