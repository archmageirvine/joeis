package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120118 <code>a(n)</code> is the number of binary strings of length n such that no subsequence of length 5 or less contains 3 or more ones.
 * @author Sean A. Irvine
 */
public class A120118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120118() {
    super(new long[] {-1, 0, -1, 0, 0, 2, 0, 1, 0, 1}, new long[] {1, 2, 4, 7, 11, 16, 26, 43, 71, 116});
  }
}
