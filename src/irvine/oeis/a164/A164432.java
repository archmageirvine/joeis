package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164432 Number of binary strings of length n with no substrings equal to 0000 0101 or 0110.
 * @author Sean A. Irvine
 */
public class A164432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164432() {
    super(4, new long[] {1, 0, 1, 1, 0, 1}, new long[] {13, 21, 34, 57, 95, 158});
  }
}
