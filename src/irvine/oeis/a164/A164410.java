package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164410 Number of binary strings of length n with no substrings equal to 0000 0001 or 0101.
 * @author Sean A. Irvine
 */
public class A164410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164410() {
    super(new long[] {2, 0, 1}, new long[] {13, 22, 38});
  }
}
