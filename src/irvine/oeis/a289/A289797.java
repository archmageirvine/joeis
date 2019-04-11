package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289797 p-INVERT of the triangular numbers (A000217), where p(S) <code>= 1 -</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A289797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289797() {
    super(new long[] {-1, 6, -16, 23, -17, 7}, new long[] {1, 5, 21, 84, 330, 1291});
  }
}
