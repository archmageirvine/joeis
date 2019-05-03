package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164432 Number of binary strings of length n with no substrings equal to <code>0000 0101</code> or 0110.
 * @author Sean A. Irvine
 */
public class A164432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164432() {
    super(new long[] {1, 0, 1, 1, 0, 1}, new long[] {13, 21, 34, 57, 95, 158});
  }
}
