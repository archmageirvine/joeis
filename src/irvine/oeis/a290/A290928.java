package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290928 p-INVERT of the positive integers, where <code>p(S) = (1 - S^3)^2</code>.
 * @author Sean A. Irvine
 */
public class A290928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290928() {
    super(new long[] {-1, 12, -66, 222, -507, 822, -965, 822, -507, 222, -66, 12}, new long[] {0, 0, 2, 12, 42, 115, 288, 738, 2020, 5751, 16362, 45697});
  }
}
