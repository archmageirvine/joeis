package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290899 p-INVERT of the positive integers, where p(S) <code>= 1 -</code> S^2 - S^4.
 * @author Sean A. Irvine
 */
public class A290899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290899() {
    super(new long[] {-1, 8, -27, 52, -63, 52, -27, 8}, new long[] {0, 1, 4, 12, 36, 110, 332, 983});
  }
}
