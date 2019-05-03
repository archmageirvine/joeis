package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290918 p-INVERT of the positive integers, where <code>p(S) = (1 - S)^3</code>.
 * @author Sean A. Irvine
 */
public class A290918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290918() {
    super(new long[] {-1, 9, -30, 45, -30, 9}, new long[] {3, 12, 43, 147, 486, 1566});
  }
}
