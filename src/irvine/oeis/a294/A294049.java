package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294049 Number of binary strings of length n avoiding substrings <code>1000, 1011, 1101,</code> or 1111.
 * @author Sean A. Irvine
 */
public class A294049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294049() {
    super(new long[] {1, 0, -2, 0, 0, 0, 1, 1}, new long[] {1, 2, 4, 8, 12, 18, 27, 41});
  }
}
