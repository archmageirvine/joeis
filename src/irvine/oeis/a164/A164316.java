package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164316 Number of binary strings of length n with no substrings equal to 000, 001, or 010.
 * @author Sean A. Irvine
 */
public class A164316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164316() {
    super(new long[] {1, 0, 1}, new long[] {1, 2, 4});
  }
}
