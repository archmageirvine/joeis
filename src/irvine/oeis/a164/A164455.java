package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164455 Number of binary strings of length n with no substrings equal to 0001 0011 or 0111.
 * @author Sean A. Irvine
 */
public class A164455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164455() {
    super(new long[] {2, -3, 0, 0, 2}, new long[] {13, 22, 36, 56, 89});
  }
}
